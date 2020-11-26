package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        char[] chars = s.toCharArray();
        int n = chars.length;
        boolean isPalindrome = true;
        List<Character> charsTemp = new ArrayList<Character>();

        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122) || (chars[i] >= 48 && chars[i] <= 57))
                charsTemp.add(chars[i]);
        }
        for (int i = 0; i < charsTemp.size(); i++) {
            if (Character.toLowerCase(charsTemp.get(i)) != Character.toLowerCase(charsTemp.get(charsTemp.size() - i - 1)))
                isPalindrome = false;
        }
        System.out.println(isPalindrome);
    }
}
