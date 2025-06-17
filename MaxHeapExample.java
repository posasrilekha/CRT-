import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(20);
        maxHeap.offer(1);

        System.out.println("Elements removed from max-heap in descending order:");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); 
        }
        System.out.println();
    }
}
