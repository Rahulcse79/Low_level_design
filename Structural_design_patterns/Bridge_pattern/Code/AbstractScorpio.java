package Structural_design_patterns.Bridge_pattern.Code;

public abstract class AbstractScorpio {

    // BRIDGE
    AbstractScorpioImpl scorpioImpl;

    public AbstractScorpio(AbstractScorpioImpl asi)
    {
        this.scorpioImpl = asi;
    }

    abstract boolean isRightHanded();

    abstract void printSafetyReq();
    
}
