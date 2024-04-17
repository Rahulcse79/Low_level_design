package Java_revision.Oops_revision;

public class Student {
    // Attributes 
    public int id;
    public int age;
    public String name;
    public int nos;
    public int[] gpa;
 
    // Constructor
    public Student(int gpa) {
        System.out.println("Student constructor is called.");
        this.gpa = new int[] {gpa};
    }

    // Copy constructor
    public Student(Student srcobj) {
        System.out.println("Copy constructor called!");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
        this.gpa = new int[] {srcobj.gpa[0]};
    }

    // Methods

    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(gpa[0] + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }   

    // Destructor equivalent (finalize method)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " destructor is called.");
        super.finalize();
    }

    public static void main(String[] args) {
        // Uncomment to use non-default constructor
        // Student A = new Student(9);
        // A.id = 1;
        // A.age = 23;
        // A.name = "Rahul singh";
        // A.nos = 9;
        // A.study();
        // A.sleep();

        // Student B = new Student();
        // B.name = "Akash singh";
        // B.study();

        // Copy 
        // Student B = new Student(A);
        // B.sleep();

        Student C = new Student(9);
        C.id = 2;
        C.age = 24;
        C.name = "Jhon";
        C.nos = 12;
        C.study();
        C.sleep();

        // In Java, you don't need to explicitly delete objects
        // The garbage collector will handle it
    }
}

