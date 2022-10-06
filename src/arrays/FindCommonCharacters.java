package arrays;


import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> out = commonChars(words);
        for (String s : out) {
            System.out.println(s);
        }
    }

    private static List<String> commonChars(String[] words) {
    }

//    public static List<String> commonChars(String[] words) {

//        for (int i = 97; i<=122; i++) {
//            for (String word : words) {
//            }
//        }

//    }
}
