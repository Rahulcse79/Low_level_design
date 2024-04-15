public class ScorpioFactory{
    
    public RCscorpio createScorpio(char type){
        switch(type){
            case 'N': return new ScorpioN();

            case 'C': return new ScorpioClassic();
        
            default: return new RCscorpio();
        }
    }
}
