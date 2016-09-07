package CTCI.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

/**
 * Created by craigjohnson on 9/6/16.
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println(palindromePermutation("craig"));
    }

    private static boolean palindromePermutation(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character ch = null;
        Integer count = null;

        for (int i = 0; i < s.length(); i++) {
            count = map.get(s.charAt(i));
            ch = s.charAt(i);
            if (count == null) {
                map.put(ch, 1);
            }
            else {
                map.put(ch, count+1);
            }
        }

        int oddCount = 0;
        for(Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
