import java.util.Random;

public class Seeker extends Player implements Success{

    @Override
    public boolean isSuccessful(){
        Random random = new Random();
        int chance = random.nextInt(100);
        if(chance <= 5){
            return true;
        }
        return false;
    }
}
