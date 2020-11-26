package cracking_code_interview.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class IsUnique_1_1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s = "sabin";
        boolean isUnique = isUniqueCharsBit(s);
//        for(int i = 0; i < s.length(); i++)
//        {
//            char ch = s.charAt(i);
//            if(map.containsKey(ch))
//            {
//                isUnique = false;
//                break;
//            }else{
//                map.put(ch, i);
//            }
//        }
        System.out.println(isUnique);
    }
    public static boolean isUniqueStr(String str)
    {
        boolean [] chSet = new boolean[128];
        char ch;
        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(chSet[ch])
            {
                return false;
            }
            else
                chSet[ch] = true;
        }
        return true;
    }

    public static boolean isUniqueCharsBit(String str) {
        int checker = 0;
        for (int i= 0; i < str.length(); i++) {
            int val= str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
