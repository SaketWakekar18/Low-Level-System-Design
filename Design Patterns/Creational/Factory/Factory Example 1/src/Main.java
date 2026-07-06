import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Scorpio> list = new ArrayList<>();
        Scorpio scorpioClassic = new ScorpioClassic();
        Scorpio scorpioN = new ScorpioN();

        list.add(scorpioClassic);
        list.add(scorpioN);

        for (Scorpio sc: list){
            sc.createEngine();
        }

//        ScorpioFactory factory = new ScorpioFactory();
//        Scorpio scorpioClassic = factory.createEngine("C");
//        scorpioClassic.createEngine();
//
//        Scorpio scorpioN = factory.createEngine("N");
//        scorpioN.createEngine();

    }
}