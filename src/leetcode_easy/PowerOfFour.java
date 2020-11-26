package leetcode_easy;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 64;
        double fraction = (double) 1 / 4;
        boolean pof = false;
        System.out.println(Math.pow((double) n, fraction));
        System.out.println((int) (Math.pow((double) n, fraction)));
        if (n == 0)
            pof = false;
        else if (n == 4)
            pof = true;
        else if (Math.pow((double) n, fraction) == (int) (Math.pow((double) n, fraction)))
            pof = true;

        System.out.println(pof);
    }
}
