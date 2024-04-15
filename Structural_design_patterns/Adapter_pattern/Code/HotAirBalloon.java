package Structural_design_patterns.Adapter_pattern.Code;

public class HotAirBalloon {
    
    String gasUsed = "Helium";

    void start(String gas)
    {
        System.out.println("Hot air balloon is starting.");
    }

    String getGasUse()
    {
        return gasUsed;
    }
}
