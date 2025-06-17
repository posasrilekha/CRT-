import java.util.Arrays;
public class MinHeap1{
    private int[] heap;
    private int size;
    private int capacity;
    public MinHeap1(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }
    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap full! Cannot insert " + val);
            return;
        }
        heap[size] = val;
        size++;
        heapifyUp(size - 1);
        System.out.println("Heap after inserting " + val + ": " + Arrays.toString(Arrays.copyOf(heap, size)));
        System.out.println("Heap property valid? " + isMinHeap());
    }
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }
    public int removeMin() {
        if (size == 0) {
            System.out.println("Heap empty!");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        System.out.println("Heap after removing min (" + min + "): " + Arrays.toString(Arrays.copyOf(heap, size)));
        System.out.println("Heap property valid? " + isMinHeap());
        return min;
    }
    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }
    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    public boolean isMinHeap() {
        for (int i = 0; i <= (size - 2) / 2; i++) { 
            int left = leftChild(i);
            int right = rightChild(i);
            if (left < size && heap[i] > heap[left]) return false;
            if (right < size && heap[i] > heap[right]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        MinHeap1 minHeap = new MinHeap1(10);
        int[] values = {20, 15, 30, 10, 40, 5};
        for (int val : values) {
            minHeap.insert(val);
        }
        while (minHeap.size > 0) {
            minHeap.removeMin();
        }
    }
}
