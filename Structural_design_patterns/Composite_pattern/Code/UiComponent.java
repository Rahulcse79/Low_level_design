package Structural_design_patterns.Composite_pattern.Code;

public interface UiComponent {

  void draw();
  
  void add(UiComponent component);

  void remove(UiComponent component);
} 
