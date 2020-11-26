package crackingcodeinterview;

public class PermutationCount {
     final static int numChars = 5;
    static int count = 0;
    public static void main(String[] args) {
        printSortedStrings(3);
    }
    static void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }
    static void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (true) {
                System.out.println(prefix + count++);
            }
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }
    static boolean isinOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }
    static char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }
}
