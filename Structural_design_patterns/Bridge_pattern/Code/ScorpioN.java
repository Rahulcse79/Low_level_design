package Structural_design_patterns.Bridge_pattern.Code;

public class ScorpioN extends AbstractScorpio{

    public ScorpioN(AbstractScorpioImpl abstractScorpio)
    {
        super(abstractScorpio);
    }

    @Override
    boolean isRightHanded() {
        return scorpioImpl.isRightHanded();
    }

    @Override
    void printSafetyReq() {
        scorpioImpl.printSafetyReq();
    }
    

}
