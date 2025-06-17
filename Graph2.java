import java.util.*;
public class Graph2 {
    private Map<Integer, List<Integer>> adjList;

    public Graph2() {
        adjList = new HashMap<>();
    }
    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
    public void dfsIterative(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.print(vertex + " ");

                // Add neighbors in reverse order to maintain the same traversal order as recursive DFS
                List<Integer> neighbors = adjList.getOrDefault(vertex, new ArrayList<>());
                Collections.sort(neighbors, Collections.reverseOrder()); // Optional, for consistent output
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph1 graph = new Graph1();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("Iterative DFS starting from vertex 1:");
        graph.dfsIterative(1);
    }
}
