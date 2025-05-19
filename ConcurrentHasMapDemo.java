import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasMapDemo {
    
    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> map = new ConcurrentHashMap<>();
        Integer[] test = new Integer[]{1,2,3};
        Thread writer1 = new Thread(() -> addPositiveNumbers(map));
        Thread writer2 = new Thread(() -> addNegativeNumbers(map));

        writer1.start();
        writer2.start();

        // Here, in the main thread, we can use Iterator, retrieve values or update the map

        writer1.join(); // wait for writer1 thread
        writer2.join(); // wait for writer2 thread

        System.out.println(map.size()); // the result is always the same
        System.out.println(length(test));

    }

    private static void addPositiveNumbers(Map<Integer, String> target) {
        for (int i = 0; i < 100_000; i++) {
            target.put(i, "Number is " + i);
        }
    }

    public static <E> int length(E[] t) {
        return t.length;
    }

    private static void addNegativeNumbers(Map<Integer, String> target) {
        for (int i = -100_000; i < 0; i++) {
            target.put(i, "Number is " + i);
        }
    }

}
