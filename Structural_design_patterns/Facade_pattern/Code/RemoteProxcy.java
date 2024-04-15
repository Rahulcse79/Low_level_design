package Structural_design_patterns.Facade_pattern.Code;

public class RemoteProxcy implements ICar {

    RCscorpio scorpio = new RCscorpio();

    @Override
    public void turnLeft() {
        System.out.println("I am inside turn left in remote proxcy.");
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turn right in remote proxcy.");
        scorpio.turnRight();
    }

    @Override
    public void gostraight() {
        System.out.println("I am inside go straight in remote proxcy.");
        scorpio.gostraight();
    }
}
