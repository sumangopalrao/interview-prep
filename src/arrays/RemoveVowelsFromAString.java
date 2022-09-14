// Leetcode: Remove vowels from a string
package arrays;

public class RemoveVowelsFromAString {

    public static void main(String[] args) {
        System.out.println(removeVowels("basddseeib"));
    }

    private static String removeVowels(String str) {
        StringBuilder builder = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u')
                continue;
            builder.append(c);
        }
        return builder.toString();
    }
}
