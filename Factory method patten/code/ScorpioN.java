import Models.ScorpioNIBodyShell;
import Models.ScorpioNIEngine;

public class ScorpioN extends Scorpio{
 
    @Override
    public void makeScorpio(){
        System.out.println("Make scorpio function call in ScorpioN");
        this.engine = new ScorpioNIEngine();
        this.bodyShell = new ScorpioNIBodyShell();     
    }

    @Override
    public void driveCar(){
        makeScorpio();
        System.out.println("I am driving a ScorpioN");
    } 
}
