package CTCI.chapter1;

import java.util.HashMap;
import java.util.Map;

import static com.sun.tools.doclint.Entity.nu;

/**
 * Created by craigjohnson on 9/7/16.
 */
public class Problem2 {
    public static void main(String[] args) {
        System.out.println(isPermutation("racecar", "carrace"));
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Character ch1 = null;
        Character ch2 = null;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            ch1 = s1.charAt(i);
            ch2 = s2.charAt(i);

            if (map.get(ch1) == null) {
                map.put(ch1, 1);
            } else {
                map.put(ch1, map.get(ch1) + 1);
            }

            if (map.get(ch2) == null) {
                map.put(ch2, -1);
            } else {
                map.put(ch2, map.get(ch2) - 1);
            }

        }

        for(Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() != 0) return false;
        }
        return true;
    }
}
