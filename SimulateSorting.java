import java.util.PriorityQueue;
import java.util.Scanner;
public class SimulateSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            minHeap.offer(element); 
        }
        System.out.println("Elements in sorted order:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); 
        }
        System.out.println();
        sc.close();
    }
}
