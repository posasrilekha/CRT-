public class BubbleSortExample2 {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    // Swap strings
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Corrected string array
        String[] arr = {"S", "r", "i", "l", "e", "k", "h", "a"};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
