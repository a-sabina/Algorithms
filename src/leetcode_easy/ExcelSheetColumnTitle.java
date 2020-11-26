package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        Character sheetNamePairs[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int n = 1048;
        int product = n / 26;
        String name = "";

        if (product < 1 || n == 26) {
            name = sheetNamePairs[n - 1].toString();
        } else if ((product >= 1 && product <= 26) || n == 702) {
            int remainder = n - 26 * product;
            if (remainder == 0) {
                name = sheetNamePairs[product - 2].toString() + sheetNamePairs[25].toString();
            } else {
                name = sheetNamePairs[product - 1].toString() + sheetNamePairs[remainder - 1].toString();
            }
        } else {
            n = n % 702;
            product = n / 26;

            if (product < 1 || n == 26) {
                name = sheetNamePairs[0].toString() + sheetNamePairs[0].toString() + sheetNamePairs[n - 1].toString();
            } else if ((product >= 1 && product <= 26) || n == 702) {
                int remainder = n - 26 * product;
                if (remainder == 0) {
                    name = sheetNamePairs[0].toString() + sheetNamePairs[product - 2].toString() + sheetNamePairs[25].toString();
                } else {
                    name = sheetNamePairs[0].toString() + sheetNamePairs[product - 1].toString() + sheetNamePairs[remainder - 1].toString();
                }
            }
        }
        System.out.println(name);

    }
}
