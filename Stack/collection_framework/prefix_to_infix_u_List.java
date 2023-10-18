package collection_framework;

import java.util.Stack;

public class prefix_to_infix_u_List {
    public static void main(String[] args) {
        String s = "++ab*cd";
        Stack<String> stack = new Stack<>();

        for (int i = s.length()-1; i >= 0 ; i--) {  //---------reverse for post to in------------------------
            if (s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '/' ||s.charAt(i) == '*' ){
                String left = stack.peek();
                stack.pop();
                String right = stack.peek();
                stack.pop();

                String newString = "(" + left + s.charAt(i) + right +")";
                stack.add(newString);

            }else {
                stack.add(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }

}
