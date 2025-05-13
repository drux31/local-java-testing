import java.util.*;
public class SyncronisedMapDemo {
    public static void main(String... args)  throws InterruptedException {

        Map<Integer, String> synchronizedNumbers = Collections.synchronizedMap(new HashMap<>());

        Thread writer = new Thread(() -> addPositiveNumbers(synchronizedNumbers));
        writer.start();
    
        addNegativeNumbers(synchronizedNumbers); // add negative numbers from the main thread
    
        writer.join(); // wait for the writer thread
    
        System.out.println(synchronizedNumbers.size()); // the size is always 200_000
    }

    private static void addPositiveNumbers(Map<Integer, String> target) {
        for (int i = 0; i < 100_000; i++) {
            target.put(i, "Number is " + i);
        }
    }
    
    private static void addNegativeNumbers(Map<Integer, String> target) {
        for (int i = -100_000; i < 0; i++) {
            target.put(i, "Number is " + i);
        }
    }

}