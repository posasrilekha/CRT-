import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeOps3{
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
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
    public Node search(Node root, int value) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == value) {
                return current; 
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return null;
    }
    public void mirror(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    public void printLevelOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        BinaryTreeOps3 tree = new BinaryTreeOps3();
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);

        System.out.print("Original tree (level order): ");
        tree.printLevelOrder(root);

        tree.mirror(root);

        System.out.print("Mirrored tree (level order): ");
        tree.printLevelOrder(root);
    }
}
