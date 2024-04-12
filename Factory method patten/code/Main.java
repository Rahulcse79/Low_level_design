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

        Collection<Scorpio> list = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        Scorpio car3 = new ScorpioN();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        for(Scorpio car: list){
            car.driveCar();
        }
    }
}