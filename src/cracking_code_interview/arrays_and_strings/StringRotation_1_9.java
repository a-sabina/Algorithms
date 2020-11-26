package cracking_code_interview.arrays_and_strings;

public class StringRotation_1_9 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        String s1s2 = s1 + s2;
        System.out.println(s1s2.contains(s1));
    }
}
