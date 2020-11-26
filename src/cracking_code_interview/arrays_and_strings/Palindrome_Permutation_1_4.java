package cracking_code_interview.arrays_and_strings;

public class Palindrome_Permutation_1_4 {
    public static void main(String[] args) {
        String s = "Tact Cyhoa";
        boolean isPP = isPalindromePermutation(s);
        System.out.println(isPP);
    }

    public static boolean isPalindromePermutation (String str)
    {
        String lowerStr = str.toLowerCase();
        int len = lowerStr.length();
        int oddCount = 0;
        char [] chars = new char[256];
        for(int i = 0; i < len; i++)
        {
            char ch = lowerStr.charAt(i);
            if(ch != ' ')
            {
                chars[ch] ++;
            }
        }
        for(int i = 0; i < lowerStr.length(); i++)
        {
            char ch = lowerStr.charAt(i);
            if(lowerStr.charAt(i) != ' ' && chars[ch] % 2 != 0)
            {
                oddCount ++;
            }
        }
        if(oddCount < 2)
            return true;

        return  false;
    }
}
