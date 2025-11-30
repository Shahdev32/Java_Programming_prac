import java.util.*;

public class DFSGraph {
    private int V;                         
    private LinkedList<Integer>[] adj;      

    DFSGraph(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge (Undirected graph)
    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // DFS helper function
    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : adj[node]) {
            if (!visited[neigh]) {
                dfsUtil(neigh, visited);
            }
        }
    }

    // DFS traversal
    void dfs(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);

        g.dfs(0);   // Start DFS from node 0
    }
}
