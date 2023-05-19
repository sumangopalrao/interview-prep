// Find if the graph is bipartie, a bipartite is one where each node in one set has an edge to another node in another set of vertices
// https://leetcode.com/problems/is-graph-bipartite/
// NEED REVIEW

package graphs;

public class IsBipartite {

    public static boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; ++i) {
            if (colors[i] == 0 && !dfs(graph, colors, i, 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean dfs(int[][] graph, int[] colors, int node, int color) {
        // color the node
        colors[node] = color;
        // for each neighbor
        for (int nei : graph[node]) {
            // if the neighbor is uncolored, color it with the opposite color
            if (colors[nei] == 0 && !dfs(graph, colors, nei, -color)) {
                return false;
            } 
            // if the neighbor is colored with the same color, the graph is not bipartite
            else if (colors[nei] == color) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] graph = { {1,3}, {0,2}, {1,3}, {0,2} };
        int[][] graph1 = { {1,2,3}, {0,2}, {0,1,3}, {0,2} };
        System.out.println(isBipartite(graph));
        System.out.println(isBipartite(graph1));
    }
}
