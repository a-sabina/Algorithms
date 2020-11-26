package cracking_code_interview.arrays_and_strings;

import java.util.ArrayList;

public class URLify_1_3 {
    public static void main(String[] args) {
        String s = "Mr John Smith   ";
        StringBuilder finalString = new StringBuilder();
        int endLength = 13;
        ArrayList<String> allStrings = new ArrayList<>();

        for(int i = 0; i < endLength; i++)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                allStrings.add(String.valueOf(ch));
            }
            else{
                allStrings.add("%20");
            }
        }
        for(String str : allStrings)
        {
            finalString.append(str);
        }
        System.out.println(finalString);
    }
}
