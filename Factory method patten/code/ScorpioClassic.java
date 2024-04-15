import Models.ScorpioClassicIBodyShell;
import Models.ScorpioClassicIEngine;

public class ScorpioClassic extends RCscorpio{
    
    @Override
    public void makeScorpio(){
        System.out.println("Make scorpio function call in ScorpioClassic");
        this.engine = new ScorpioClassicIEngine();
        this.bodyShell = new ScorpioClassicIBodyShell();
    }

    @Override
    public void driveCar(){
        makeScorpio();
        System.out.println("I am driving a ScorpioClassic");
    }
}
