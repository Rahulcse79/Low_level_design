package Behavioral_Design_Pattern.ChainOfResponsibility_design_pattern;

public class EngineIssueHandler extends AbstractHandler{

    public EngineIssueHandler(AbstractHandler next) {
        super(next);
    }
    
}
