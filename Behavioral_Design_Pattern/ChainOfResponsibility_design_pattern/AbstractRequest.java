package Behavioral_Design_Pattern.ChainOfResponsibility_design_pattern;

public class AbstractRequest {
    
    private int requestCode;

    AbstractRequest(int reqCode)
    {
        this.requestCode = reqCode;
    }

    public int getRequestCode(){
        return this.requestCode;
    }
}
