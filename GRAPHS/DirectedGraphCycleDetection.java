
import java.util.*;

public class DirectedGraphCycleDetection {

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1); // Adding a cycle
        graph.addEdge(3, 4);

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
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Check for cycles in the graph
    boolean hasCycle() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        // Check for cycles in all disconnected components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCycleCheck(i, visited, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS to detect cycles
    boolean dfsCycleCheck(int node, boolean[] visited, boolean[] recStack) {
        // Mark the current node as visited and add it to the recursion stack
        visited[node] = true;
        recStack[node] = true;

        // Explore all neighbors
        for (int neighbor : adjList[node]) {
            // If neighbor is not visited, recurse
            if (!visited[neighbor]) {
                if (dfsCycleCheck(neighbor, visited, recStack)) {
                    return true; // Cycle detected
                }
            } // If neighbor is in the recursion stack, a cycle is detected
            else if (recStack[neighbor]) {
                return true;
            }
        }

        // Remove the node from the recursion stack
        recStack[node] = false;
        return false;
    }
}
