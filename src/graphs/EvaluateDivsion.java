// Given an array of values such as ["ai, bi"] where each value represents ai/bi and values for the same in another array. Find the result xi/yi which is passed as query.
// Leetcode: https://leetcode.com/problems/evaluate-division/

package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivsion {
    
    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        
        int i = 0;
        for (List<String> equation : equations) {
            graph.putIfAbsent(equation.get(0), new HashMap<>());
            graph.get(equation.get(0)).put(equation.get(1), values[i]);
            
            graph.putIfAbsent(equation.get(1), new HashMap<>());
            graph.get(equation.get(1)).put(equation.get(0), 1.0 / values[i]);
            i++;
        }
        
        double[] results = new double[queries.size()];
        int j = 0;
        for (List<String> query : queries) {
            
            String x = query.get(0);
            String y = query.get(1);
            
            if (!graph.containsKey(x) && !graph.containsKey(y)) {
                results[j] = -1.0;
            } else {
                results[j] = dfs(graph, x, y, 1.0, new HashSet<>());
            }
            j++;
        }
        return results;
    }
    
    public static double dfs(HashMap<String, HashMap<String, Double>> graph, String x, String y, double product, Set<String> visited) {
        visited.add(x);
        
        if (x.equals(y)) {
            return product;
        }
        
        Map<String, Double> neighbors = graph.get(x);
        if (neighbors != null) {
            for (String neighbor : neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    double res = dfs(graph, neighbor, y, product * neighbors.get(neighbor), visited);
                    if (res != -1.0) {
                        return res;
                    }
                }
            }
        }
        return -1.0;
    }
    
    public static void main(String[] args) {
        List<List<String>> equations = Arrays.asList(
        Arrays.asList("a", "b"),
        Arrays.asList("b", "c")
        );
        
        double[] values = new double[]{2.0,3.0};
        
        List<List<String>> queries = new ArrayList<>(Arrays.asList(
        new ArrayList<>(Arrays.asList("a", "c")),
        new ArrayList<>(Arrays.asList("b", "a")),
        new ArrayList<>(Arrays.asList("a", "e")),
        new ArrayList<>(Arrays.asList("a", "a")),
        new ArrayList<>(Arrays.asList("x", "x"))
        ));
        
        
        double[] results = calcEquation(equations, values, queries);
        for (double result : results) {
            System.out.println(result);
        }
    }
    
}
