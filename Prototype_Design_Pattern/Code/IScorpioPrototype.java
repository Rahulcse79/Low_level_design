package Prototype_Design_Pattern.Code;

public interface IScorpioPrototype {

    public IScorpioPrototype clone();

    public void setEngine(ScorpioEngine scorpioEngine);

    public void start();
}