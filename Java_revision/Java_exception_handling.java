package Java_revision;

import javax.naming.InvalidNameException;

public class Java_exception_handling {
    public static void main(String[] args){
        
        // String str = null;  // NullPointerException
        // try {
        //     int length = str.length(); // This line will throw NullPointerException
        // } catch (NullPointerException e) {
        //     System.out.println("Caught NullPointerException: " + e.getMessage());
        // }

        // int arr[] = new int[]{2, 10, 22, 23, 24, 25};

        // try{
        //     System.out.println(arr[-1]);
        // } catch (ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        // }

        // try {
        //     Object obj = "Rahul";
        //     int str = (int) obj;  // This will throw ClassCastException
        //     System.out.println(str);
        // } catch (ClassCastException e) {
        //     System.out.println("Caught ClassCastException: " + e.getMessage());
        // }

        Java_exception_handling obj1 = new Java_exception_handling();
         
        try {
            obj1.checkName("Rahul");
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

    }

    public void checkName(String name) throws InvalidNameException {
        if ("Rahul".equals(name)) {
            throw new InvalidNameException("Name cannot be Rahul");
        }
    }

    public static class InvalidNameException extends Exception {
        
        public InvalidNameException(String message) {
            super(message);
        }
    }
}
