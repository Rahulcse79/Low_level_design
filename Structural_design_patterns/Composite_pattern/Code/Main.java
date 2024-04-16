package Structural_design_patterns.Composite_pattern.Code;

public class Main {
    
    public static void main(String[] args)
    {
        UiComponent uiComponent = new Menu();
        uiComponent.add(new Button());
        uiComponent.add(new Button());
        Button btn = new Button();
        uiComponent.add(btn);
       
        uiComponent.draw();

        System.out.println("Remaining....");
        uiComponent.remove(btn);
        uiComponent.draw();
    }
}
