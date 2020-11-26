package leetcode_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    private String word;
    private HashMap<Character, Node> children = new HashMap<>();
    ;

    //constructor
    public Node() {
    }

    //setter
    public void add(Character c) {
        if (!this.children.containsKey(c)) {
            this.children.put(c, new Node());
        }
    }

    public void setWord(String w) {
        this.word = w;
    }

    public String getWord() {
        return this.word;
    }

    public HashMap<Character, Node> getChildren() {
        return this.children;
    }
}

class TriePrefixTree {
    private Node root;

    /**
     * Initialize your data structure here.
     */
    public TriePrefixTree() {
        this.root = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Node runner = this.root;
        for (char c : word.toCharArray()) {
            runner.add((Character) c);
            runner = runner.getChildren().get(c);
        }
        runner.setWord(word);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Node runner = this.root;
        for (char c : word.toCharArray()) {
            if (c != '.' && runner.getChildren().containsKey((Character) c)) {
                runner = runner.getChildren().get((Character) c);
            } else {
                return false;
            }
        }
        if (runner.getWord() != null && runner.getWord().equals(word)) {
            return true;
        }
        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Node runner = this.root;
        for (char c : prefix.toCharArray()) {
            if (runner.getChildren().containsKey((Character) c)) {
                runner = runner.getChildren().get((Character) c);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}