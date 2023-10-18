
public class delete_middle_ele_stack {
    public static void main(String[] args) {
        int num = 12345;
        int m = num;
        int count = 0;
        int top = -1;
        int res = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }
        int stack[] = new int[count];

        int mid = stack.length / 2;

        while (m != 0) {
            int d = m % 10;
            top = push(stack, top, d);
            m /= 10;
        }
        while (!isEmpty(top)) {
            if (mid != top) {
                res = (res*10) + peek(stack,top);
                }
                top = pop(stack,top);

        }
        System.out.println(res);
    }

    public static int peek(int[] stack,int top){
        return stack[top];
    }
    public static int pop(int[] stack, int top){
        top--;
        return top;
    }
    public static boolean isEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }
    public static int push(int[] stack , int top,int value){
        top++;
        stack[top] = value;
        return top;
    }

}
