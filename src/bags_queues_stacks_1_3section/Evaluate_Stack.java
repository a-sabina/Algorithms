package bags_queues_stacks_1_3section;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String evalString = sc.next();
        for (int i = 0; i < evalString.length(); i++) {

            char ch = evalString.charAt(i);
            String s = Character.toString(ch);
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else
                vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
