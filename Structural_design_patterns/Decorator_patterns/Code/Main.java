package Structural_design_patterns.Decorator_patterns.Code;

public class Main {
    public static void main(String[] args)
    {
        ICar Scorpio = new Scorpio();
        ICar BulletProofScorpio = new BulletProof(Scorpio);
        float totalweight = BulletProofScorpio.getWeight();
        System.out.println("Printing weight: " + totalweight);
    }
}
