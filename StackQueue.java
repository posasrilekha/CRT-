import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class SatckQueue {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("ball");
		stack.push("blocks");
		stack.push("puzzle");
		System.out.println(stack);
		System.out.println("after pop" +stack.pop());
		System.out.println(stack);
		Queue<String>icecream=new LinkedList<String>();
		System.out.println("queue example:::");
		icecream.add("maya");
		icecream.add("leo");
		icecream.add("niha");
		System.out.println(icecream);
		System.out.println("remove names");
		String firstOut=icecream.poll();
		System.out.println(firstOut);
		String firstOut1=icecream.poll();
		System.out.println(firstOut1);
		System.out.println("after remove");
		System.out.println(icecream);
		
	}

}