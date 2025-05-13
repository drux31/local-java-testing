import java.util.ArrayList;
import java.util.Vector;

public class ConcurrentCollectionsDemo {
    
    public static void main(String... args) throws InterruptedException {
        //ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = Vector();

        Thread writer = new Thread(() -> addNumbers(numbers));
        writer.start();

        addNumbers(numbers); //add number from main thread

        writer.join(); //wait for writer thread

        System.out.println(numbers.size()); // the result can be any
    }

    private static void addNumbers(List<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
}
