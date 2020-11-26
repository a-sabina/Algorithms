package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IV";
        Map<Character, Integer> pairs = new HashMap();
        pairs.put('I', 1);
        pairs.put('V', 5);
        pairs.put('X', 10);
        pairs.put('L', 50);
        pairs.put('C', 100);
        pairs.put('D', 500);
        pairs.put('M', 1000);
        int result = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i != s.length() - 1) {
                if (pairs.get(s.charAt(i)) > pairs.get(s.charAt(i + 1))) {
                    result += pairs.get(s.charAt(i));
                } else if (pairs.get(s.charAt(i)) < pairs.get(s.charAt(i + 1))) {
                    result += pairs.get(s.charAt(i + 1)) - pairs.get(s.charAt(i));
                    i++;
                } else if (pairs.get(s.charAt(i)) == pairs.get(s.charAt(i + 1))) {
                    result += pairs.get(s.charAt(i + 1)) + pairs.get(s.charAt(i));
                    i++;
                }
            } else {
                result += pairs.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
