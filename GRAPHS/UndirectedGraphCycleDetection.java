
import java.util.ArrayList;

public class UndirectedGraphCycleDetection {

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 1); // Adding a cycle

        if (graph.hasCycle()) {
            System.out.println("Cycle detected in the graph");
        } else {
            System.out.println("No cycle detected in the graph");
        }
    }
}

class Graph {

    private int V; // Number of vertices
    private ArrayList<ArrayList<Integer>> adj; // Adjacency list

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Since the graph is undirected
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[V];
        // Check for a cycle in each connected component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int v, int parent, boolean[] visited) {
        visited[v] = true;
        for (int i = 0; i < adj.get(v).size(); i++) {
            int neighbor = adj.get(v).get(i);
            if (!visited[neighbor]) {
                if (dfs(neighbor, v, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // If the neighbor is visited and is not the parent, it's a cycle
                return true;
            }
        }
        return false;
    }
}
