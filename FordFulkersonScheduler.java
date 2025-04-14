import java.util.*;

public class FordFulkersonScheduler {
    static final int INF = Integer.MAX_VALUE;
    static int V;

    // DFS to find augmenting path
    static boolean bfs(int[][] rGraph, int s, int t, int[] parent) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < V; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return visited[t];
    }

    static int fordFulkerson(int[][] graph, int s, int t) {
        int[][] rGraph = new int[V][V]; // Residual graph
        for (int u = 0; u < V; u++)
            System.arraycopy(graph[u], 0, rGraph[u], 0, V);

        int[] parent = new int[V];
        int maxFlow = 0;

        while (bfs(rGraph, s, t, parent)) {
            int pathFlow = INF;
            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                rGraph[u][v] -= pathFlow;
                rGraph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    public static void main(String[] args) {
        String[] courses = {"DAA", "TOC", "NLP", "STS", "DSA"};
        String[] slots = {"a", "b", "c", "d"};

        int n = courses.length;
        int m = slots.length;

        V = 2 + n + m; // Source + Sink + courses + slots
        int source = 0, sink = V - 1;

        int[][] graph = new int[V][V];

        // Source to courses
        for (int i = 0; i < n; i++) {
            graph[source][1 + i] = 1;
        }

        // Courses to eligible slots (no hard conflict)
        // For simplicity, allow all courses to all slots
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[1 + i][1 + n + j] = 1;
            }
        }

        // Slots to sink
        for (int j = 0; j < m; j++) {
            graph[1 + n + j][sink] = 1;
        }

        long start = System.nanoTime();
        int maxMatch = fordFulkerson(graph, source, sink);
        long end = System.nanoTime();

        System.out.println(" Max number of non-conflicting courses scheduled: " + maxMatch);
        System.out.println("Total Courses: " + n);
        System.out.println("Conflicts (unscheduled): " + (n - maxMatch));
        System.out.println("Time Taken: " + (end - start) + " ns");
        System.out.println("Time Complexity: O(V * E^2)");
    }
}
