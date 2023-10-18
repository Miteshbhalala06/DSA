import java.util.Arrays;

public class rev_num_u_stack {
    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        int top = -1;
        int rev = 0;
        int count = 0;

        while (num > 0){
            num = num / 10;
            count++;
        }
        int stack [] = new int[count];

        while (n != 0){
            int d = n % 10;
            top = push(stack,top,d);
            n = n / 10;
        }
        int pv = 1;
        while (!isEmpty(top)){
            int digit = peek(stack,top);
            rev += digit * pv;
            pv *= 10;
            top = pop(top);
        }
        System.out.println(rev);
    }
    private static int pop(int top){
         top--;
        return top;
    }
    private static int peek(int[] stack,int top){
        return stack[top];
    }
    private static boolean isEmpty( int top){
        if (top == -1){
            return true;
        }
        return false;
    }
    private static int push(int[] stack , int top,int value){
        top++;
        stack[top] = value;
        return top;
    }
}
