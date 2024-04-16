package Behavioral_Design_Pattern.ChainOfResponsibility_design_pattern;

public class PressureIssyueHandler extends AbstractHandler{

    public static int code = 303;
    
    public PressureIssyueHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request)
    {
        if(request.getRequestCode() == code)
        {
            System.out.println("PressureHandler is handling request.");
        }
        else
        {
            super.handleRequest(request);
        }
    }
}
