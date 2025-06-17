import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOps2 {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Counts non-leaf nodes
    public int countNonLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null || current.right != null) {
                count++;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return count;
    }

    // Searches for a node with the given value and returns it if found
    public Node search(Node root, int value) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == value) {
                return current; // Found the node
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return null; // Not found
    }

    public static void main(String[] args) {
        BinaryTreeOps2 tree = new BinaryTreeOps2();
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);

        int nonLeafCount = tree.countNonLeafNodes(root);
        System.out.println("Non-leaf nodes count: " + nonLeafCount);

        int valueToSearch = 15;
        Node foundNode = tree.search(root, valueToSearch);
        if (foundNode != null) {
            System.out.println("Value " + valueToSearch + " found in the tree.");
        } else {
            System.out.println("Value " + valueToSearch + " not found in the tree.");
        }
    }
}
