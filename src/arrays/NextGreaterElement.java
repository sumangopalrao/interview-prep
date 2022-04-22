//Find the next greater element in an array, if not present output -1.
//Taken from https://www.interviewbit.com/problems/nextgreater/
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
	
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    ArrayList<Integer> res = new ArrayList<Integer>(a.size());
	    int[] r = new int[a.size()];
	    Stack<Integer> st = new Stack<Integer>();
	    st.push(0);
	    for(int i=1; i<a.size(); i++) {
	        if(a.get(i) > a.get(st.peek())) {
	            while(!st.isEmpty() && a.get(i) > a.get(st.peek())) {
	            	r[st.peek()] = a.get(i);
	                st.pop();
	            }
	        }
        	st.push(i);
	    }
	    
	    while(!st.isEmpty()) {
	    	r[st.peek()] = -1;
	    	st.pop();
	    }
	    
//	  convert back to array list since asList does not box
	    for(int i=0; i<r.length; i++) {
	    	res.add(r[i]);
	    }
	    
	    return res;
	}
	
	//O(n^2) solution
// 	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
// 	    ArrayList<Integer> res = new ArrayList<Integer>();
// 	    int curPos = 0;
// 	    for(Integer i : a) {
// 	        int j = curPos+1;
// 	        for(; j<a.size(); j++) {
// 	            if(a.get(j) > i) {
// 	                a.set(curPos, a.get(j));
// 	                break;
// 	            }
// 	        }
// 	        if(j == a.size())
// 	            a.set(curPos, -1);
// 	        curPos++;
// 	    }
// 	    return a;
// 	}
	
	
//		public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
//	    ArrayList<Integer> res = new ArrayList<Integer>(a.size());
//	    int[] r = new int[a.size()];
//	    int curLen = 0;
//	    Stack<Integer> st = new Stack<Integer>();
//	    st.push(a.get(0));
//	    for(int i=1; i<a.size(); i++) {
//	        if(a.get(i) > st.peek()) {
//	        	int prev = curLen;
//	            while(!st.isEmpty() && a.get(i) > st.peek()) {
//	                r[curLen + st.size() - 1] = a.get(i);
//	                st.pop();
//	            }
//	            curLen = prev + curLen;
//	            st.push(a.get(i));
//	        }
//	        else {
//	        	st.push(a.get(i));
//	        }
//	    }
//	    
//	    while(!st.isEmpty()) {
//	    	r[curLen + st.size() - 1] = -1;
//	    	st.pop();
//	    	curLen++;
//	    }
//	    
//	    //convert back to array list since asList does not box
//	    for(int i=0; i<r.length; i++) {
//	    	res.add(r[i]);
//	    }
//	    
//	    return res;
//	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inList = new ArrayList<Integer>(Arrays.asList(4,3,2,1));
		List<Integer> res = nextGreater(inList);
		for(Integer i : res) {
			System.out.println(i);
		}
	}
}
