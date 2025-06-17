class Node {
    int data;
    Node left;
    Node right;
    public Node(int val) {
        data = val;
        left = right = null;
    }
}
public class BinaryTree1 {
    Node root;
    public BinaryTree1() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
    public void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public void printPostorder(Node node) {
        if (node == null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public int findHeight(Node node) {
        if (node == null) return -1;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.print("Preorder Traversal: ");
        tree.printPreorder(tree.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.printInorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.printPostorder(tree.root);
        System.out.println();

        int height = tree.findHeight(tree.root);
        System.out.println("Height of Tree: " + height);
    }
}
