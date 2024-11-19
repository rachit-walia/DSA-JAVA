
import java.util.*;

public class minimumEdge {

    public static void main(String[] args) {
        int V = 6;
        CycleDetectorUndirected graph = new CycleDetectorUndirected(V);

        graph.add(1, 2);
        graph.add(2, 4);
        graph.add(3, 5);
        graph.add(4, 6);
        graph.add(2, 5);

        if (graph.hasCycle()) {
            System.out.println("Cycle detected in the graph");
        } else {
            System.out.println("No cycle detected in the graph");
        }

        int v1 = 1;
        int v2 = 5;
        int distance = graph.minEdge(v1, v2);

        if (distance != -1) {
            System.out.println("Minimum edge distance between " + v1 + " and " + v2 + ": " + distance);
        } else {
            System.out.println("No path exists between " + v1 + " and " + v2);
        }
    }
}

class CycleDetectorUndirected {

    int V;
    List<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    CycleDetectorUndirected(int V) {
        this.V = V;
        adjList = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    void add(int v1, int v2) {
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (dfsCycleCheck(i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfsCycleCheck(int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                if (dfsCycleCheck(neighbor, node, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    int minEdge(int v1, int v2) {
        boolean[] visited = new boolean[V + 1];
        int[] distance = new int[V + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(v1);
        visited[v1] = true;
        distance[v1] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;
                    queue.add(neighbor);

                    if (neighbor == v2) {
                        return distance[neighbor];
                    }
                }
            }
        }

        return -1;
    }
}
