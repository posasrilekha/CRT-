class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListMergeSort {

    // Main function to sort the linked list
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Split the list into halves
        ListNode mid = getMiddle(head);
        ListNode secondHalf = mid.next;
        mid.next = null; // Break the list

        // Step 2: Recursively sort both halves
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(secondHalf);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }

    // Function to find the middle of the linked list
    private ListNode getMiddle(ListNode head) {
        if (head == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }
}
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        LinkedListMergeSort sorter = new LinkedListMergeSort();
        head = sorter.mergeSort(head);

        printList(head); // Output: 1 -> 2 -> 3 -> 4
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

