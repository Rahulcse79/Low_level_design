package Structural_design_patterns.Bridge_pattern.Code;

public class Main {
    public static void main(String[] args)
    {
        AbstractScorpio scorpio = new ScorpioN(new ScorpioN_impl_india());
        System.out.println(scorpio.isRightHanded());
    }
}
