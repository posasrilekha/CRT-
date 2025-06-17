import java.util.*;
public class MinHeap {
    private ArrayList<Integer> heap;
    public MinHeap() {
        heap = new ArrayList<>();
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        while (i > 0 && heap.get(i) < heap.get((i - 1) / 2)) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int removeMin() {
        if (heap.size() == 0) return -1;
        if (heap.size() == 1) return heap.remove(0);

        int min = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        heapify(0);
        return min;
    }

    private void heapify(int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < heap.size() && heap.get(l) < heap.get(smallest))
            smallest = l;
        if (r < heap.size() && heap.get(r) < heap.get(smallest))
            smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public void print() {
        System.out.println(heap);
    }

    // Main method to test the MinHeap
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        // Insert elements
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(0);
        minHeap.insert(8);

        System.out.println("Heap after inserts:");
        minHeap.print();
        System.out.println("Removing elements:");
        while (true) {
            int min = minHeap.removeMin();
            if (min == -1) break;
            System.out.println("Removed min: " + min);
            System.out.print("Heap now: ");
            minHeap.print();
        }
    }
}
