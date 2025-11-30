import java.util.*;

public class BFSGraph {
    private int V;                    // Number of vertices
    private LinkedList<Integer>[] adj;  // Adjacency list

    BFSGraph(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // BFS Function
    void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // start BFS
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neigh : adj[node]) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    queue.add(neigh);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(6);

        // Adding edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);

        // Starting BFS from node 0
        g.bfs(0);
    }
}
