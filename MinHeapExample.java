import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(20);
        minHeap.offer(15);
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(40);
        System.out.println("MinHeap elements in ascending order:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
