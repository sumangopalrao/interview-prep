package arrays;

import java.util.HashMap;
import java.util.Map;

// Find if two strings are isomorphic; if one string can be converted to another string
// https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1117/

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        for(Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(c, t.charAt(i));
            } else if(map.get(c) != t.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("eg", "fg"));
		System.out.println(isIsomorphic("badc", "baba"));
	}
}
