package Code;

import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder{

    Scorpio car;

    @Override
    public void buildEngine() {
         
        System.out.println("Scorpio engine getting inserted.");
    }

    @Override
    public void buildChassis() {
        
        System.out.println("Scorpio chassis getting inserted.");
    }

    @Override
    public void buildTyre() {
        
        System.out.println("Scorpio tyre getting inserted.");
    }

    @Override
    public void buildBodyShell() {
        
        System.out.println("Scorpio bodyshell getting inserted.");
    }

    @Override
    public ICar build() {
        
        return car;
    }
    
}
