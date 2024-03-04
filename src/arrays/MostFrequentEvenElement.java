// Program to find the most frequent even elements in array
// https://leetcode.com/problems/most-frequent-even-element/description/

package arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {

        public int mostFrequentEven(int[] nums) {
            HashMap<Integer, Integer> counts = new HashMap<>();
            for (int num : nums) {
                if (num % 2 == 0)
                    counts.put(num, counts.getOrDefault(num, 0) + 1);
            }

            if (counts.isEmpty())
                return -1; // Check if there are no even elements

            // No need for a PriorityQueue; instead, we can directly find the most frequent
            // even element
            int mostFrequentEven = -1;
            int highestFrequency = 0;

            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int num = entry.getKey();
                int frequency = entry.getValue();

                // Check if this number has a higher frequency, or if it's a tie, whether it's
                // smaller than the current most frequent
                if (frequency > highestFrequency || (frequency == highestFrequency && num < mostFrequentEven)
                        || mostFrequentEven == -1) {
                    mostFrequentEven = num;
                    highestFrequency = frequency;
                }
            }

            return mostFrequentEven;

        }
    }
}
