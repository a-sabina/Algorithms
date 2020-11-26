package leetcode_easy;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] s = {"sa"};
        String prefix = "";
        String first = (s != null && s.length > 0) ? s[0] : "";
        if (s.length > 1) {
            firstLoop:
            for (int j = 0; j < first.length(); j++) {
                secondLoop:
                for (int i = 1; i < s.length; i++) {
                    if (s[i].length() > j) {
                        if (s[i].charAt(j) != first.charAt(j)) {
                            break firstLoop;
                        } else {
                            if (i == s.length - 1)
                                prefix += first.charAt(j);

                        }
                    } else {
                        break firstLoop;
                    }
                }
            }
        } else
            prefix = first;
        System.out.println(prefix);

    }
}
