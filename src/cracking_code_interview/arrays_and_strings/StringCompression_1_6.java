package cracking_code_interview.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class StringCompression_1_6 {
    public static void main(String[] args) {
    String originalString = "aabbcd";
    String compressedString = compressMethod(originalString);
    System.out.println(compressedString);

    }
    public static String compressMethod(String str)
    {
        String cmp ="";
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            count++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1))
            {
                cmp += String.valueOf(str.charAt(i)) + count;
                count = 0;
            }
        }
        return cmp;
    }
}
