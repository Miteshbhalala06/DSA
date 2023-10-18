public class postfix_to_infix_u_stack {
    public static void main(String[] args) {
        
        String postfix = "ab+cd*+";
        String stack[] = new String[10];
        int top = -1;

        for (int i = 0; i < postfix.length(); i++) {
            if (postfix.charAt(i) == '+' || postfix.charAt(i) == '-' ||
                    postfix.charAt(i) == '*' || postfix.charAt(i) == '/' ){
                String left = peek(stack,top);
                top = pop(top);
                String right = peek(stack,top);
                top = pop(top);
                String newString = "(" + right + postfix.charAt(i) + left + ")";
                top = push(stack,top,newString);


            }else {
                top = push(stack,top,String.valueOf(postfix.charAt(i)));
            }
            
        }
        System.out.println(peek(stack,top));
        
    }
    public static int pop(int top){
        top--;
        return top;
    }
    public static String peek(String[] stack,int top){
        return stack[top];
    }
    public static int push(String[] stack,int top,String value){
        top++;
        stack[top] = value;
        return top;
    }
}
