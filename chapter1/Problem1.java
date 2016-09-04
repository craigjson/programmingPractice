package chapter1;

import java.util.HashMap;

/**
 * Created by craigjohnson on 9/2/16.
 * Problem 1.1
 * Determine if a String has all unique characters
 * Follow Up: What about if you are not allowed to use any extra space?
 */
public class Problem1 {
    public static void main(String [] args) {
        System.out.println(allUnique1("Craig"));
        System.out.println(allUnique1("Hello"));

        System.out.println(allUnique2("Craig"));
        System.out.println(allUnique2("Hello"));

        System.out.println(allUnique3("Craig$"));
        System.out.println(allUnique3("Hello$"));

    }

    public static boolean allUnique1(String str) {
        HashMap<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null)
                map.put(str.charAt(i), true);
            else
                return false;
        }
        return true;
    }

    //No extra space, operates in O(n^2) time
    public static boolean allUnique2(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (c == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    //O(n) space, O(n) time, array solution, assuming ASCII encoding
    public static boolean allUnique3(String str) {
        boolean[] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]) {
                return false;
            }
            arr[str.charAt(i)] = true;
        }
        return true;
    }
}
