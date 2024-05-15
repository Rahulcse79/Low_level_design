package Java_revision.Basic_java_revision;

public class Java_wrapper_class {
    
    public static void main(String[] args)
    {
        int num = 5;

        Integer n = Integer.valueOf(num);
        System.out.println(n);
        Integer m = num;  // AutoBoxing.
        System.out.println(m);

        Integer number = 9;
        int numberValue = number.intValue();
        System.out.println("Value of number is: " + numberValue);

        // Check integer object.
        if(number instanceof Integer)
        {
            System.out.println("Yes, is an integer object value: " + number);
        }
    }
}
