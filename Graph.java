import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;
    private boolean isDirected;
    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        this.adjList = new HashMap<>();
    }
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }
    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);

        if (!isDirected) {
            adjList.get(dest).add(src);
        }
    }
    public void removeEdge(int src, int dest) {
        List<Integer> srcList = adjList.get(src);
        List<Integer> destList = adjList.get(dest);

        if (srcList != null) srcList.remove((Integer) dest);
        if (!isDirected && destList != null) destList.remove((Integer) src);
    }
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public Map<Integer, List<Integer>> getAdjList() {
        return adjList;
    }
}
