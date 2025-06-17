public class BubbleSortAlphabetical {
    public static void main(String[] args) {
        String[] names = {"Charlie", "Alice", "Eve", "Bob", "David"};
        System.out.println("Before Sorting:");
        for (String name : names) {
            System.out.println(name);
        }
        bubbleSort(names);
        System.out.println("\nAfter Sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
