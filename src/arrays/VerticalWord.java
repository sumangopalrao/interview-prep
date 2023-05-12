package arrays;

import java.util.ArrayList;
import java.util.List;

public class VerticalWord {

        public static List<String> printVertically(String s) {
            String[] words = s.split(" ");
            int maxLen = 0;
            for (String word : words) {
                maxLen = Math.max(maxLen, word.length());
            }
            
            List<StringBuilder> output = new ArrayList<>();
            for (int i = 0; i < maxLen; i++) {
                output.add(new StringBuilder());
            }
            
            for (int i = 0; i < maxLen; i++) {
                for (String word : words) {
                    if (i < word.length()) {
                        output.get(i).append(word.charAt(i));
                    } else {
                        output.get(i).append(' ');
                    }
                }
            }
            
            for (StringBuilder sb : output) {
                while (sb.charAt(sb.length() - 1) == ' ') {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            
            List<String> result = new ArrayList<>();
            for (StringBuilder sb : output) {
                result.add(sb.toString());
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(printVertically("HELLO WORLD"));
        }
    
}
