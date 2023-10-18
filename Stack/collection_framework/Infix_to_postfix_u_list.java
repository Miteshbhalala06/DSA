package collection_framework;

import java.util.Stack;

public class Infix_to_postfix_u_list {
    public static void main(String[] args) {
        String s = "++ab*cd";
        Stack<String> stack = new Stack<>();

        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/' ){
                String left = stack.peek();
                stack.pop();
                String right = stack.peek();
                stack.pop();

                String newString = "(" + left + right + s.charAt(i) + ")";
                stack.add(newString);
            }else {
                stack.add(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
