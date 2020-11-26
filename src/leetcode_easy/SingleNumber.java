package leetcode_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 2, 5};
        int[] resultArray = new int[2];
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : numbers) {
            if (map.containsKey((i))) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                result.add(entry.getKey());
        }
        resultArray[0] = result.get(0);
        resultArray[1] = result.get(1);
        System.out.println(result);
    }
}
