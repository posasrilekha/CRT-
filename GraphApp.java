import java.util.*;
public class GraphApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Graph graph=new Graph(false);
		System.out.println("Enter no.of edges:");
		int edges=sc.nextInt();
		System.out.println("Enter edges (format:src dest):");
		for(int i=0;i<edges;i++){
			int src=sc.nextInt();
			int dest=sc.nextInt();
			graph.addEdge(src,dest);
		}
		System.out.println("Graph:");
		graph.printGraph();
	}
}