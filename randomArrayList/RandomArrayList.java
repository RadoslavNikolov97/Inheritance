package randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T>   {

    public T getRandomElement() {
        int end = super.size();
        Random randomIndex = new Random();
        int randIndex = randomIndex.nextInt(end);
        return remove(randIndex);


    }
}
