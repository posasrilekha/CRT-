import java.util.PriorityQueue;
import java.util.Arrays;

public class KLargestElements {
    public static int[] findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        int[] result = new int[minHeap.size()];
        int i = 0;
        for (int val : minHeap) {
            result[i++] = val;
        }
        Arrays.sort(result);
        for (int left = 0, right = result.length - 1; left < right; left++, right--) {
            int temp = result[left];
            result[left] = result[right];
            result[right] = temp;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 12, 2, 11};
        int k = 3;
        int[] largest = findKLargest(nums, k);
        System.out.println("K largest elements are: " + Arrays.toString(largest));
    }
}
