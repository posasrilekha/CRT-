import java.util.PriorityQueue;
public class MinHeapExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(20);
        minHeap.offer(15);
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(40);
        System.out.println("Removing min repeatedly and printing:");
        while (!minHeap.isEmpty()) {
            int min = minHeap.poll();  
            System.out.print(min + " ");
        }
    }
}
