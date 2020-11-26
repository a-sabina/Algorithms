package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    private final int MAX_LEN = 1000;
    private List<Integer>[] set;

    private int getIndex(int key) {
        return key % MAX_LEN;
    }

    private int getPosition(int key, int index) {
        List<Integer> temp = set[index];
        if (temp == null)
            return -1;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == key)
                return i;
        }
        return -1;
    }

    public DesignHashSet() {
        set = (List<Integer>[]) new ArrayList[MAX_LEN];
    }

    public void add(int key) {
        int index = getIndex(key);
        int pos = getPosition(key, index);
        if (pos < 0) {
            if (set[index] == null)
                set[index] = new ArrayList<>();
            set[index].add(key);
        }
    }

    public void remove(int key) {
        int index = getIndex(key);
        int pos = getPosition(key, index);
        if (pos >= 0)
            set[index].remove(pos);
    }

    public boolean contains(int key) {
        int index = getIndex(key);
        int pos = getPosition(key, index);
        return pos >= 0;
    }

    public static void main(String[] args) {
        DesignHashSet hashSet = new DesignHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));    // returns true
        System.out.println(hashSet.contains(3));    // returns false (not found)
        hashSet.add(2);
        System.out.println(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));    // returns false (already removed)

    }
}
