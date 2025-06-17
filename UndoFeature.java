import java.util.Stack;

public class UndoFeature {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        actions.push("Write");
        actions.push("Delete");
        actions.push("Insert");

        System.out.println("Last action (peek): " + actions.peek());

        System.out.println("Undoing action: " + actions.pop());
        System.out.println("Undoing action: " + actions.pop());

        System.out.println("Remaining actions in stack: " + actions);
    }
}