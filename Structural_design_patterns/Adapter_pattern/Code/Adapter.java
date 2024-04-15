package Structural_design_patterns.Adapter_pattern.Code;

public class Adapter implements ICar{

    HotAirBalloon hotAirBalloon;
        
    public Adapter(HotAirBalloon balloon){
        this.hotAirBalloon = balloon;
    };
    
    @Override
    public void start() {
        String gasToBeUsed = hotAirBalloon.gasUsed;
        hotAirBalloon.start(gasToBeUsed);
    }

}
