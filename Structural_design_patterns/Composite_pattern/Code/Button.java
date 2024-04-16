package Structural_design_patterns.Composite_pattern.Code;

public class Button implements UiComponent{

    @Override
    public void draw() {
       System.out.println("Drawing button");
    }

    @Override
    public void add(UiComponent component) {
        System.out.println("Adding button");
    }

    @Override
    public void remove(UiComponent component) {
      System.out.println("Removing button");
    }
    

}
