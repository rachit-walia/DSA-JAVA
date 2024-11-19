
import java.util.*;

class BfsExample {

    // Method to perform BFS on a graph
    public void bfs(int startNode, Map<Integer, List<Integer>> graph) {
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();

        // Add the starting node to the queue and mark as visited
        queue.add(startNode);
        visited.add(startNode);

        // Perform BFS
        while (!queue.isEmpty()) {
            // Remove the front node from the queue
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Get all neighbors of the current node
            List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
            for (int i = 0; i < neighbors.size(); i++) {
                int neighbor = neighbors.get(i);
                if (!visited.contains(neighbor)) {
                    // Add unvisited neighbors to the queue
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}

public class BFS {

    public static void main(String[] args) {
        // Create a graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5, 6));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));
        graph.put(6, Arrays.asList(2));

        // Create an instance of BfsExample
        BfsExample bfsExample = new BfsExample();

        // Start BFS from node 0
        System.out.println("BFS Traversal starting from node 0:");
        bfsExample.bfs(0, graph);
    }
}
