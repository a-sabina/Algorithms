package leetcode_easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([)]";
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        Character ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                left.push(ch);
            } else {
                switch (ch) {
                    case ')':
                        if (left.peek() == '(') {
                            left.pop();
                        } else {
                            right.push(ch);
                        }
                        break;
                    case '}':
                        if (left.peek() == '{') {
                            left.pop();
                        } else {
                            right.push(ch);
                        }
                        break;
                    case ']':
                        if (left.peek() == '[') {
                            left.pop();
                        } else {
                            right.push(ch);
                        }
                        break;
                }
            }
        }
        System.out.println(left);
        System.out.println(right);

    }
}
