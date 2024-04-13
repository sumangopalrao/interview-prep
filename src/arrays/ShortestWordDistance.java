// Write a function that takes two words as input and returns the shortest distance between the two words in the list.
// https://leetcode.com/problems/shortest-word-distance/description/

package arrays;

public class ShortestWordDistance {
    public static void main(String[] args) {
        System.out.println(shortestDistance(new String[] {"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {

        int index1 = -1; 
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE; 

        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                index1 = i;
                if (index2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            } else if (wordsDict[i].equals(word2)) {
                index2 = i;
                if (index1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(index1 - index2));
                }
            }
        }

        return minDistance;
        
    }
}
