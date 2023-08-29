// Given an array of temparatures for days, find the number of days to wait before a sunny day.
// Leetcode:: https://leetcode.com/problems/daily-temperatures/description/

package stacks;

import java.util.Stack;

public class DailyTemperatures {

    
	public static class Tuple {
		int index;
		int temperature;
		
		public Tuple(int temperature, int index) {
			this.index = index;
			this.temperature = temperature;
		}
		
		public int getTemperature() {
			return this.temperature;
		}
		
		public int getIndex() {
			return this.index;
		}
		
	}

    // Brute force solutoin for Daily Temperatures
    private static int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];

        for (int i=0; i<temperatures.length - 1; i++) {
            for(int j=i+1; j<temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    private static int[] dailyTemperaturesStack(int[] temperatures) {

        Stack<Tuple> st = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++) {
            if (st.isEmpty()) {
                st.push(new Tuple(temperatures[i], i));
            } else {
                if (st.peek().getTemperature() >= temperatures[i]) {
                    st.push(new Tuple(temperatures[i], i));
                } else {
                    while (!st.isEmpty() && temperatures[i] > st.peek().getTemperature())  {
                        Tuple top = st.pop();
                        res[top.getIndex()] = i - top.getIndex();
                    }
                    st.push(new Tuple(temperatures[i], i));
                }
            }
        }

        return res;
    }

        

    public static void main(String[] args) {
        // int[] res = dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        int[] res = dailyTemperaturesStack(new int[]{73,74,75,71,69,72,76,73});

        for (int val : res) {
            System.out.println(val);
        }

    }
}
