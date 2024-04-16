package Java_revision.Basic_java_revision;

import java.util.Scanner;

public class TakeInput {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age: " + age);
        sc.close();
    }
}
