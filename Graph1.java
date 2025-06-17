import java.util.*;
public class Graph1{
    private Map<Integer, List<Integer>> adjList;
    public Graph1() {
        adjList = new HashMap<>();
    }
    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
    public void printGraph1() {
        for (int vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph1 graph = new Graph1();
        Graph1 graph = new Graph1();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        System.out.println("Graph (Adjacency List):");
        graph.printGraph1();
    }
}
