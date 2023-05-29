package Brinde;
import java.util.Random;

public class brinde implements sorteio{

    @Override
    public boolean sortudo() {
        Random random = new Random();
        return random.nextBoolean();
    } 
}
