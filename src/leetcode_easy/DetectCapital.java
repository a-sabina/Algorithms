package leetcode_easy;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "FALSE";
        char[] characters = word.toCharArray();
        boolean isCapital = false;
        if (characters[0] >= 65 && characters[0] <= 90) //A
        {
            if (isLowerCaseAll(characters) || isUpperCaseAll(characters))
                isCapital = true;
        } else {
            isCapital = isLowerCaseAll(characters) ? true : false;
        }
        System.out.println(isCapital);
    }

    public static boolean isUpperCaseAll(char[] chars) {
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 97 && chars[i] <= 122)
                return false;
        }
        return true;
    }

    public static boolean isLowerCaseAll(char[] chars) {
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90)
                return false;
        }
        return true;
    }
}
