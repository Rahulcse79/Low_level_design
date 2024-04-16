package Structural_design_patterns.Bridge_pattern.Code;

public class ScorpioN_impl_USA extends AbstractScorpioImpl{

    @Override
    boolean isRightHanded() {
        return true;
    }

    @Override
    void printSafetyReq() {
       System.out.println("Safty req for USA region.");
    }
    
}
