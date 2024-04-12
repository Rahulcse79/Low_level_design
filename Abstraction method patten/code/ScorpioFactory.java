package code;

import Models.IEngine;
import Models.ScorpioIEngine;

public class ScorpioFactory implements IVehicleFactory{
    
    public IEngine createEngine(){
        
        System.out.println("Scorpio engine has been created.");

        return new ScorpioIEngine();
    }
}
