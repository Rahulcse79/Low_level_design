package Prototype_Design_Pattern.Code;

public class Scorpio implements IScorpioPrototype, Cloneable{

    ScorpioEngine engine;

    public Scorpio()
    {
        this.engine = new ScorpioEngine();
    }

    private Scorpio(ScorpioEngine scorpioEngine)
    { 
        this.engine = new ScorpioEngine(scorpioEngine);
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.engine = scorpioEngine;
    }

    @Override
    public void start() {
       System.out.println("Car is started!");
    }

    // @Override       // Shallow copy clone..
    // public IScorpioPrototype clone(){
    //     try{
    //         return (Scorpio) super.clone();
    //     }
    //     catch(CloneNotSupportedException e){
    //         throw new AssertionError();
    //     }
    // }

    // @Override       // Deep copy clone method 1.
    // public IScorpioPrototype clone(){
        
    //     IScorpioPrototype clonedScorpio = new Scorpio();
    //     clonedScorpio.setEngine(new ScorpioEngine());
    //     return clonedScorpio;
    // }

    @Override       // Deep copy clone method 2.
    public IScorpioPrototype clone(){
        
        IScorpioPrototype clonedScorpio = new Scorpio(this.engine);
        return clonedScorpio;
    }
}
