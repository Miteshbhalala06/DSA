public class rev_all_word_u_stack {
    public static void main(String[] args) {
        String str = "hello how are you";

        int top = -1;
        char[] stack = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' '){
                while (!isEmpty(top)){
                    top = pop(stack,top);
                }
                System.out.print(" ");
            }
            else {
                top = push(stack , top,str.charAt(i));

            }
        }
        while (!isEmpty(top)){
            top = pop(stack,top);
        }
    }
    private static int pop(char[] stack,int top){
        System.out.print(stack[top]);
        top--;
        return top;
    }


    private static boolean isEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }

    private static int push(char[] stack,int top,char value){
        top++;
        stack[top] = value;
        return top;
    }
}
