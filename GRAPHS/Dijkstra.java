import java.util.*;

class Dijkstra {
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {

        int V = adj.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.distance));

        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < V; i++)
            dist.add(Integer.MAX_VALUE);

        dist.set(src, 0);
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (iPair temp : adj.get(node)) {
                int adjNode = temp.first;
                int adjWeight = temp.second;

                if (dis + adjWeight < dist.get(adjNode)) {
                    dist.set(adjNode, dis + adjWeight);
                    pq.add(new Pair(dist.get(adjNode), adjNode));
                }
            }
        }

        return dist;
    }


    public static void main(String[] args) {
        
        int V = 5;

        ArrayList<ArrayList<iPair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 4, 3, 2);
        addEdge(adj, 3, 2, 1);

        int src = 0;

        Dijkstra sol = new Dijkstra();
        ArrayList<Integer> distances = sol.dijkstra(adj, src);

        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < distances.size(); i++) {
            System.out.println("Vertex " + i + ": " + distances.get(i));
        }
    }

    static void addEdge(ArrayList<ArrayList<iPair>> adj, int u, int v, int weight) {
        adj.get(u).add(new iPair(v, weight));
        adj.get(v).add(new iPair(u, weight));
    }
}

class iPair {
    int first;
    int second;

    iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Pair {
    int distance;
    int node;

    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}