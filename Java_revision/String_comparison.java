package Java_revision;

import java.util.Scanner;

public class String_comparison {
    
    public static void main(String[] args)
    {
        String name1 = "Rahul";
        String name2 = "Rahul";
        String name3 = new String("Rahul");

        System.out.println(name1.equals(name3));
        System.out.println(name1 == name3);

        Scanner sc = new Scanner(System.in);

        // String Inputhatt2 = sc.nextLine();       
        // System.out.println(Input2);

        String name4 = "     Pattern     that    lets you   pass request along a chain of handlers.";
        // System.out.println(name4.length());
        // System.out.println(name4.charAt(1));
        // System.out.println(name4.toUpperCase());
        // System.out.println(name4.toLowerCase());
        // System.out.println(name4.substring(1, 2));
        // System.out.println(name4.contains("lets you"));
        // System.out.println(name4.equals("lets"));
        // System.out.println(name3.equalsIgnoreCase("RAHUL"));
        
        // String name5 = name4.trim(); // Remove whiteSpace in starting and ending.
        // System.out.println(name4);
        // String name6 = "Hello Rahul, how are you? Rahul is good.";

        // String[] parts = name6.split("Rahul");
        
        // for (String part : parts) {
        //     System.out.println(part);
        // }
    }
}
