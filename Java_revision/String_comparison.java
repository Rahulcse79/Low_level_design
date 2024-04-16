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

        // String Input1 = sc.next();
        // System.out.println(Input1);

        // String Input2 = sc.nextLine();       
        // System.out.println(Input2);

        String name4 = "Pattern that lets you pass request along a chain of handlers.";
    }
}
