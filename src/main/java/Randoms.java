import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected ArrayList<Integer> randoms = new ArrayList<>();

    public Randoms(int min, int max) {
        int diff = max - min;
        random = new Random();
        while (true) {
            int myRandom = min + random.nextInt(diff + 1);
            this.randoms.add(myRandom);
        }

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
                int ans = randoms.get(next);
                next++;
                return ans;
            }
        };
    }
}
