
import java.util.*;

class Graph {

    static class Pair {

        int distance;
        int node;

        Pair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    static ArrayList<Integer> dijkstra(ArrayList<ArrayList<Pair>> adj, int src) {
        int V = adj.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.distance));
        ArrayList<Integer> dist = new ArrayList<>(Collections.nCopies(V, Integer.MAX_VALUE));

        dist.set(src, 0);
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int dis = current.distance;
            int node = current.node;

            for (Pair neighbor : adj.get(node)) {
                int adjNode = neighbor.node;
                int adjWeight = neighbor.distance;

                if (dis + adjWeight < dist.get(adjNode)) {
                    dist.set(adjNode, dis + adjWeight);
                    pq.add(new Pair(dist.get(adjNode), adjNode));
                }
            }
        }

        return dist;
    }

    static void addEdge(ArrayList<ArrayList<Pair>> adj, int u, int v, int weight) {
        adj.get(u).add(new Pair(weight, v));
        adj.get(v).add(new Pair(weight, u));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 4, 3, 2);
        addEdge(adj, 3, 2, 1);

        int src = 0;

        ArrayList<Integer> distances = dijkstra(adj, src);

        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < distances.size(); i++) {
            System.out.println("Vertex " + i + ": " + distances.get(i));
        }
    }
}
