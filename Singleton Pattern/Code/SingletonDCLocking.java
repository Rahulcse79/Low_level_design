
public class SingletonDCLocking {
       
    private volatile static SingletonDCLocking instance;

    private SingletonDCLocking()
    {
        System.out.println("I am singletonDCLocking constructor."); 
    }

    synchronized public static SingletonDCLocking getInstance()
    {
        if(instance == null)
        {
            synchronized (SingletonDCLocking.class)
            {
                if(instance == null)
                {
                    instance = new SingletonDCLocking();
                }
            }
        }

        return instance;
    }
    public static void main(String[] args)
    {
        Thread th1 = new Thread( ()-> {SingletonDCLocking.getInstance();});
        Thread th2 = new Thread( ()-> {SingletonDCLocking.getInstance();});

        th1.start();
        th2.start();
    }
}