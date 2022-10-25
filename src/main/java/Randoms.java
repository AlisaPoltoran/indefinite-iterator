import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;
    int diff;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.diff = max - min;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int myRandom = min + random.nextInt(diff + 1);
                return myRandom;
            }
        };
    }
}
