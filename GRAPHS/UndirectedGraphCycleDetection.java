
import java.util.*;

public class UndirectedGraphCycleDetection {

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 2); // Adding a cycle

        if (graph.hasCycle()) {
            System.out.println("Cycle detected in the graph");
        } else {
            System.out.println("No cycle detected in the graph");
        }
    }
}

class Graph {

    int V; // Number of vertices
    List<Integer>[] adjList; // Adjacency list

    // Constructor
    Graph(int V) {
        this.V = V;
        adjList = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // Undirected graph
    }

    // Check for cycles in the graph
    boolean hasCycle() {
        boolean[] visited = new boolean[V + 1]; // Track visited nodes

        // Check for cycles in all disconnected components
        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (bfsCycleCheck(i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // BFS to detect cycles
    boolean bfsCycleCheck(int start, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, -1}); // {current node, parent node}
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int node = pair[0];
            int parent = pair[1];

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    // If visited and not the parent, cycle detected
                    return true;
                }
            }
        }
        return false; // No cycle detected
    }
}
