import java.util.Random;

public class Beater extends Player implements Success {
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
            int chance = random.nextInt(100);
            if (chance <= 40) {
                return true;
            }
        return false;
    }
}
