public class prefix_to_infix_u_stack {
    public static void main(String[] args) {

        String prefix = "*-A/BC-/AKL" +
                "";
        String[] stack = new String[10];
        int top = -1;
        for (int i = prefix.length()-1; i >= 0; i--) {
            if (prefix.charAt(i) == '*' || prefix.charAt(i) == '/' ||
            prefix.charAt(i) == '-' || prefix.charAt(i) == '+'){
                String left = peek(stack,top);
                top = pop(top);
                String right = peek(stack,top);
                top = pop(top);
                String newString = "(" + left+prefix.charAt(i)+right+")";
                top = push(stack,top,newString);
            }else {
                top = push(stack,top,String.valueOf(prefix.charAt(i)));
            }

        }
        System.out.println(peek(stack, top));

    }
    public static int pop(int top){
        top--;
        return top;
    }
    public static String peek(String[] stack,int top){
        return stack[top];
    }
    public static int push(String[] stack , int top , String value){
        top++;
        stack[top] = value;
        return top;
    }

//    ((A-(B/C))*((A/K)-L))
}
