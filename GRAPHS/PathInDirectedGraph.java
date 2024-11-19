
import java.util.*;

public class PathInDirectedGraph {

    public static void main(String[] args) {
        int V = 5;
        DirectedGraph graph = new DirectedGraph(V);

        graph.add(1, 2);
        graph.add(2, 3);
        graph.add(3, 4);
        graph.add(4, 2); // Adding a back edge to create a cycle
        graph.add(4, 5);

        // Find path between two nodes
        int start = 1, end = 5;
        List<Integer> path = graph.findPath(start, end);

        if (!path.isEmpty()) {
            System.out.println("Path from " + start + " to " + end + ": " + path);
        } else {
            System.out.println("No path exists from " + start + " to " + end);
        }
    }
}

class DirectedGraph {

    int V;
    List<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    DirectedGraph(int V) {
        this.V = V;
        adjList = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    void add(int v1, int v2) {
        adjList[v1].add(v2);
    }

    List<Integer> findPath(int start, int end) {
        boolean[] visited = new boolean[V + 1];
        List<Integer> path = new ArrayList<>();

        if (dfsFindPath(start, end, visited, path)) {
            return path;
        } else {
            return Collections.emptyList();
        }
    }

    private boolean dfsFindPath(int current, int end, boolean[] visited, List<Integer> path) {
        visited[current] = true;
        path.add(current);

        if (current == end) {
            return true;
        }

        for (int neighbor : adjList[current]) {
            if (!visited[neighbor]) {
                if (dfsFindPath(neighbor, end, visited, path)) {
                    return true;
                }
            }
        }

        path.remove(path.size() - 1);
        return false;
    }
}
