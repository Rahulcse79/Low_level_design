import Models.IBodyShell;
import Models.IEngine;
import Models.ScorpioIBodyShell;
import Models.ScorpioIEngine;

public class Scorpio {
       
    IEngine engine;

    IBodyShell bodyShell;

    public void makeScorpio(){
        System.out.println("Make scorpio function call in Scorpio");
        this.engine = new ScorpioIEngine();
        this.bodyShell = new ScorpioIBodyShell();
    }

    public void driveCar()
    {
        makeScorpio();
        System.out.println("I am inside Scorpio parent class");
    }
}
