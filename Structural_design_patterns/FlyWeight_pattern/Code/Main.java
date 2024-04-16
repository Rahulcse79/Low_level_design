package Structural_design_patterns.FlyWeight_pattern.Code;

public class Main {
    public static void main(String[] args)
    {
        Tejas plane = new Tejas();

        for(int i=0; i<5; i++)
        {
            int srcX = 10, srcY = 20, desX = 100, desY = 200, speed = 50;
            double result = plane.getTotalTimeToReachDestination(srcX, srcY, desX, desY, speed);
            System.out.println("Time: " + result);
        }
    }
}
