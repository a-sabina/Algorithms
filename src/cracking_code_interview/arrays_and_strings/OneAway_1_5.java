package cracking_code_interview.arrays_and_strings;

public class OneAway_1_5 {
    public static void main(String[] args) {
        String s1 = "pal";
        String s2 = "pppp";
        System.out.println(isEdited(s1,s2));
    }

    public static boolean isEdited (String s1, String s2)
    {
        if(Math.abs(s1.length() - s2.length()) >=2)
            return false;
        if(s1.length() == s2.length())
        {
            return isUpdated(s1,s2);
        }
        else{
            return isInsertedOrDeleted(s1,s2);
        }
    }
    public static boolean isInsertedOrDeleted (String s1, String s2)
    {
        if(s1.length() > s2.length())
        {
            // deleted
            for(int i= 0; i< s2.length(); i++)
            {
                if(!s1.contains(s2.substring(i,i+1)))
                {
                    return false;
                }
            }
        }else
        {
            // inserted
            for(int i= 0; i< s1.length(); i++)
            {
                if(!s2.contains(s2.substring(i,i+1)))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isUpdated (String s1, String s2)
    {
        int diffCount = 0;
        for(int i= 0; i< s1.length(); i++)
        {
            if(s1.substring(i,i+1) != s2.substring(i,i+1))
            {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}
