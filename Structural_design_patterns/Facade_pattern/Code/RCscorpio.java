package Structural_design_patterns.Facade_pattern.Code;

public class RCscorpio implements ICar {

    @Override
    public void turnLeft() {
        System.out.println("I am inside turn-left in scorpio class.");
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turn-right in scorpio class.");
    }

    @Override
    public void gostraight() {
       System.out.println("I am inside go straight in scorpio class.");
    } 
}
