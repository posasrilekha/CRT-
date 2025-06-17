import java.util.*;

public class Graphs{
    private Map<Integer, List<Integer>> adjList;
    private boolean isDirected;
    public Graphs(boolean isDirected) {
        this.adjList = new HashMap<>();
        this.isDirected = isDirected;
    }
    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);

        if (!isDirected) {
            adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
    }
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the graph
    public static void main(String[] args) {
        // Create a directed graph (change to false for undirected)
        Graphs graph = new Graphs(false); // false = undirected, true = directed

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        System.out.println("Adjacency List of the Graph:");
        graph.printGraph();
    }
}
