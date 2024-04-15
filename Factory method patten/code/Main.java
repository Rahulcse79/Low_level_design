import java.util.ArrayList;
import java.util.Collection;

public class Main{
    public static void main(String[] args){
       
        // ScorpioN s1 = new ScorpioN();
        // s1.driveCar();

        // ScorpioClassic s2 = new ScorpioClassic();
        // s2.driveCar();

        // ScorpioFactory factory = new ScorpioFactory();
        // Scorpio car1 = factory.createScorpio('C');
        // car1.driveCar();

        Collection<RCscorpio> list = new ArrayList<>();
        RCscorpio car1 = new ScorpioN();
        RCscorpio car2 = new ScorpioClassic();
        RCscorpio car3 = new ScorpioN();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        for(RCscorpio car: list){
            car.driveCar();
        }
    }
}