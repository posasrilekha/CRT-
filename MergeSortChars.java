public class MergeSortChars {
    static void merge(char[] chars, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArr = new char[n1];
        char[] rightArr = new char[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = chars[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = chars[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                chars[k++] = leftArr[i++];
            } else {
                chars[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            chars[k++] = leftArr[i++];
        }

        while (j < n2) {
            chars[k++] = rightArr[j++];
        }
    }

    // MergeSort function for char array
    static void mergesort(char[] chars, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergesort(chars, left, mid);
            mergesort(chars, mid + 1, right);

            merge(chars, left, mid, right);
        }
    }

    public static void main(String[] args) {
        char[] chars = {'z', 'a', 'c', 'b'};
        mergesort(chars, 0, chars.length - 1);

        System.out.println(chars);  // Output: abcz
    }
}
