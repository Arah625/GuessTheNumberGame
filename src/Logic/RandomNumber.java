package Logic;

import java.util.Random;

public class RandomNumber {

    int min;
    int max;
    Random random = new Random();

    public int randomNumber(int min, int max) {
        this.min = min;
        this.max = max;
        return random.nextInt((max - min) + 1) + min;
    }

}
