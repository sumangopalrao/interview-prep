//Time Planner problem from Pramp.
//Implement a function meetingPlanner that given the availability, slotsA and slotsB, of two people and a meeting duration dur, returns the earliest time slot that works for both of them and is of duration dur. 
//If there is no common time slot that satisfies the duration requirement, return null.

package arrays;

public class TimePlanner {

  static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
    // your code goes here
    
	  int i=0;
	    int j=0;
	    int[] out  = new int[2];
	    while(i < slotsA.length && j < slotsB.length) {
	      if(slotsA[i][0] < slotsB[j][0]) {
	        if(slotsB[j][0] + dur <= slotsB[j][1] && slotsB[j][0] + dur <= slotsA[i][1]) {
	          out[0] = slotsB[j][0];
	          out[1] = slotsB[j][0] + dur;
	          return out;
	        }
	        else if(slotsB[j][0] + dur > slotsB[j][1]) {
	          j++;
	        }
	        else i++;
	      }
	      else if(slotsA[i][0] > slotsB[j][0]) {
	        if(slotsA[i][0] + dur <= slotsB[j][1] && slotsA[i][0] + dur <= slotsA[i][1]) {
	          out[0] = slotsA[i][0];
	          out[1] = slotsA[i][0] + dur;
	          return out;
	        }
	        else if(slotsA[i][0] + dur > slotsA[i][1]) {
	          i++;
	        }
	        else j++;
	      }
	      else {
	        if(slotsA[i][0] + dur <= slotsA[i][1] && slotsA[i][0] + dur <= slotsB[j][1]) {
	          out[0] = slotsA[i][0];
	          out[1] = slotsA[i][0] + dur;
	          return out;
	        } 
	        else {
	          i++;
	          j++;
	        }
	      }
	    }
	    int[] outnull = {};
	    return outnull;
  }

  public static void main(String[] args) {
      int[][] arr = {{10, 50}, {60, 120}, {140, 210}};
      int[][] arrB = {{0, 15}, {60, 70}};
      int[] print = meetingPlanner(arr, arrB, 8);
      System.out.println(print[0] + "," + print[1]);
  }

}