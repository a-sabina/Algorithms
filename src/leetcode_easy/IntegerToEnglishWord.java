package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishWord {
    public static void main(String[] args) {
        int number = 123;
        Map<Integer, String> intToWords = new HashMap<>();
        intToWords.put(0, "Zero");
        intToWords.put(1, "One");
        intToWords.put(2, "Two");
        intToWords.put(3, "Three");
        intToWords.put(4, "Four");
        intToWords.put(5, "Five");
        intToWords.put(6, "Six");
        intToWords.put(7, "Seven");
        intToWords.put(8, "Eight");
        intToWords.put(9, "Nine");
        intToWords.put(10, "Ten");
        intToWords.put(20, "Twenty");
        intToWords.put(30, "Thirty");
        intToWords.put(40, "Forty");
        intToWords.put(50, "Fifty");
        intToWords.put(60, "Sixty");
        intToWords.put(70, "Seventy");
        intToWords.put(80, "Eighty");
        intToWords.put(90, "Ninety");
        intToWords.put(100, "Hundred");
        intToWords.put(1000, "Thousand");
        intToWords.put(10000, "Zero");
        intToWords.put(100000, "Zero");
        intToWords.put(1000000, "Zero");


    }
}
