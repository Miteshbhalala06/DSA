package collection_framework;

import java.util.Stack;

public class Balanced_paranthes {
    public static void main(String[] args) {
        String s ="[((){})]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()){
                    System.out.println(" not balanced");
                    return;
                }
                char c = stack.pop();
                if (c == '(' && s.charAt(i) != ')' || c == '[' && s.charAt(i) != ']'
                        || c == '{' && s.charAt(i) != '}'){
                    System.out.println("Not Balanced");
                    return;
                }
            }

        }
        if (stack.isEmpty()){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }

    }
}
