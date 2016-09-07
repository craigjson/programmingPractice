package CTCI.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by craigjohnson on 9/7/16.
 */
public class Problem2 {
    public static void main(String[] args) {
        System.out.println(isPermutation("racecar", "carrace"));
        System.out.println(isPermutation("a", "a"));
        System.out.println(isPermutation("aaa", "aaa"));
        System.out.println(isPermutation("racecarrrrr", "carraceeeee"));
        System.out.println(isPermutation("racecar", "car"));
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;

        Character ch1 = null;
        Character ch2 = null;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            ch1 = s1.charAt(i);
            ch2 = s2.charAt(i);

            handleChar(map, ch1, true);
            handleChar(map, ch2, false);
        }

        for(Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() != 0) return false;
        }
        return true;
    }

    private static void handleChar(HashMap<Character, Integer> map, Character ch, boolean posNeg) {
        int val = posNeg ? 1 : -1;
        Integer num = map.get(ch);
        if (num == null) {
            map.put(ch, val);
        } else {
            map.put(ch, num + val);
        }
    }

}
