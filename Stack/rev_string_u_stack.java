public class rev_string_u_stack {
    public static void main(String[] args) {
        String str = "hello";
        int top = -1;
        char [] stack = new char[str.length()];


        for (int i = 0; i < str.length(); i++) {
            top = push(stack,top,str.charAt(i));
        }

        print(stack,top);
    }

    private static void print(char[] stack , int top){
        while (top >= 0){
            System.out.print(stack[top]);
            top--;
        }
    }


    private static int push(char[] stack ,int top ,char value){
        top++;
        stack[top] = value;
        return top;
    }
}
