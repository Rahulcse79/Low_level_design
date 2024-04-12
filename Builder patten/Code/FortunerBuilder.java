package Code;

import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder{

    Fortuner car;

    @Override
    public void buildEngine() {
         
        System.out.println("Fortuner engine getting inserted.");
    }

    @Override
    public void buildChassis() {
        
        System.out.println("Fortuner chassis getting inserted.");
    }

    @Override
    public void buildTyre() {
        
        System.out.println("Fortuner tyre getting inserted.");
    }

    @Override
    public void buildBodyShell() {
        
        System.out.println("Fortuner bodyshell getting inserted.");
    }

    @Override
    public ICar build() {
        
        return car;
    }
    
}
