import java.util.concurrent.ThreadLocalRandom;

public class Random {

        public static int RInt(double min, double max){
            int random = (int) ThreadLocalRandom.current().nextDouble(min, max + 1);

            return random;
        }

}
