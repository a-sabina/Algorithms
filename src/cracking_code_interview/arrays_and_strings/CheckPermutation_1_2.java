package cracking_code_interview.arrays_and_strings;

import java.util.Arrays;

public class CheckPermutation_1_2 {
    public static void main(String[] args) {
        String s1 = "sabi";
        String s2 = "basi";

        System.out.println(isPermutationOfString(s1,s2));

    }

    public static boolean isPermutationOfString (String s1, String s2)
    {
        char [] s1_chars = s1.toCharArray();
        char [] s2_chars = s2.toCharArray();
        Arrays.sort(s1_chars);
        Arrays.sort(s2_chars);
        for(int i = 0; i < s1_chars.length; i++)
        {
            if(s1_chars[i] != s2_chars[i])
            {
                return  false;
            }
        }
        return  true;
    }
}
