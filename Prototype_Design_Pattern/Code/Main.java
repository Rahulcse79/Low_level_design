package Prototype_Design_Pattern.Code;

public class Main{
    public static void main(String[] args)
    {
        // Create a prototype.
        IScorpioPrototype prototype = new Scorpio();

        // Create a scorpio N.
        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());
        scorpioN.start();

        // Create a scorpio classic.
        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new ScorpioClassicEngine());
        scorpioClassic.start();
    }
}