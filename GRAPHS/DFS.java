
import java.util.*;

class DFSRecursive {

    // Recursive method to perform DFS
    public void dfs(int currentNode, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(currentNode);
        System.out.print(currentNode + " ");

        // Explore all neighbors of the current node
        List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
        for (int i = 0; i < neighbors.size(); i++) {
            int neighbor = neighbors.get(i);
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}

public class DFS {

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

        // Create an instance of DFSRecursive
        DFSRecursive dfsRecursive = new DFSRecursive();

        // Perform DFS starting from node 0
        System.out.println("DFS Traversal starting from node 0:");
        Set<Integer> visited = new HashSet<>();
        dfsRecursive.dfs(0, graph, visited);
    }
}
