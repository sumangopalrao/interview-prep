// Find the minimum number of vertices in a DCG which are required to travers to every other node in the graph
// https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/description/

package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfVertices {
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        List<Integer> res = new ArrayList<>();
        boolean[] vertices = new boolean[n];
        for( List<Integer> edge : edges) {
            vertices[edge.get(1)] = true;
        }

        for (int i=0; i < vertices.length; i++) {
            if (!vertices[i]) {
                res.add(i);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>();
        
        edges.add(Arrays.asList(0, 1));
        edges.add(Arrays.asList(0, 2));
        edges.add(Arrays.asList(2, 5));
        edges.add(Arrays.asList(3, 4));
        edges.add(Arrays.asList(4, 2));
        List<Integer> res = findSmallestSetOfVertices(6, edges);
        for (Integer val : res) {
            System.out.println(val);
        }
    }
}
