import java.util.*;
public class MedianFinder {
    private PriorityQueue<Integer> lower; 
    private PriorityQueue<Integer> upper; 
    public MedianFinder() {
        lower = new PriorityQueue<>(Collections.reverseOrder());
        upper = new PriorityQueue<>();
    }

    public void addNum(int num) {
        lower.offer(num);
        upper.offer(lower.poll());
        if (lower.size() < upper.size()) {
            lower.offer(upper.poll());
        }
    }
    public double findMedian() {
        if (lower.size() == upper.size()) {
            return (lower.peek() + upper.peek()) / 2.0;
        } else {
            return lower.peek();
        }
    }
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        int[] stream = {5, 15, 1, 3};

        for (int num : stream) {
            mf.addNum(num);
            System.out.println("Current median: " + mf.findMedian());
        }
    }
}
