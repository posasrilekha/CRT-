class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortLinkedList {

    // Merge Sort entry point
    public static ListNode mergeSort(ListNode head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // Split list into two halves
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null; // Cut the list into two halves

        // Recursively sort both halves
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Helper method to find the middle node
    private static ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper method to merge two sorted lists
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(7);

        System.out.println("Original list:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}
