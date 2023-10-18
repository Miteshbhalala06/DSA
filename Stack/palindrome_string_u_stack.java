public class palindrome_string_u_stack {
    public static void main(String[] args) {

//        string is palindrome or not? using stack

        String str = "nitina";
        char stack[] = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            top = push(stack,top,str.charAt(i));

        }
        String s1 = print(stack,top);
        System.out.println(s1);
        if (str.equals(s1)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    private static String print (char[] stack,int top){
        String s1 = "";
        if (top == -1){
            System.out.println("stack is empty");
        }
        while (top >= 0){
//            System.out.print(stack[top]);
            s1 = s1 + stack[top];
            top--;
        }
        return s1;
    }
    private static int push(char[] stack,int top,char value){
        top++;
        stack[top] = value;
        return top;
    }

}
