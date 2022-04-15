//Program to find the build order given the set of projects and dependencies.
//CTCI 4.7
package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BuildOrder {
	
	private static Stack<String> findBuildOrder(String[] projects, String[][] dependencies) {
		Stack<String> order = new Stack<String>();
		Map<String, List<String>> adjList = convertToList(dependencies);
		return findOrder(projects, adjList);
	}
	
	private static Stack<String> findOrder(String[] projects, Map<String, List<String>> map) {
		Stack<String> st = new Stack<String>();
		Set<String> visited = new HashSet<String>();
		for(String s : projects) {
			findDFS(s, projects, map, visited, st);
		}
		return st;
	}
	
	private static void findDFS(String s, String[] projects, Map<String, List<String>> map, Set<String> visited, Stack<String> st) {
		if(st.contains(s))
			return;
		visited.add(s);
		List<String> adj = map.get(s);
		if(adj == null) {
			st.push(s);
			return;
		}
		for(String c : adj) {
			if(!visited.contains(c)) {
				findDFS(c, projects, map, visited, st);
			}
		}
		st.push(s);
	}
	
	private static Map<String, List<String>> convertToList(String[][] dependencies) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(int i=0; i<dependencies.length; i++) {
			if(map.get(dependencies[i][0]) == null) {
				List<String> list = new LinkedList<String>();
				list.add(dependencies[i][1]);
				map.put(dependencies[i][0], list);
			}
			else {
				List<String> list = map.get(dependencies[i][0]);
				list.add(dependencies[i][1]);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] projects = new String[]{ "A", "B", "C", "D", "E", "F", "G"};
		String[][] dependencies = new String[][]{{"A", "E"}, {"F", "C"}, {"F", "B"}, {"C", "A"}, {"B", "A"}, {"B", "E"}, {"F", "A"}, {"D", "G"}};
		Stack<String> out = findBuildOrder(projects, dependencies);
		while(!out.isEmpty()) {
			System.out.println(out.pop());
		}
	}
}
