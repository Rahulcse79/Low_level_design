package Behavioral_Design_Pattern.ChainOfResponsibility_design_pattern.Code;

public class Tejas implements IAirCraft{
    
    // Intrinsic property.
    private final String name = "Tejas";

    private final int seater = 2;

    private final String dimensions = "15m long and 4m wide";

    private final String wingSpan = "40 feet";

    // Extrinsic property.
    public double getTotalTimeToReachDestination(int srcX, int srcY, int desX, int desY, int speed){
        
        return 5;
    };

    
}
