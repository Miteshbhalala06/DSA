public class All_algo_in_stack {
    public static void main(String[] args) {

        int stack [] = new int[5];
        int top = -1;


        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        top = push(stack,top,40);
        top = push(stack,top,50);
        top = push(stack,top,60);
        display(stack,top);
        top = pop(stack,top);
        System.out.println("after popped");
//        display(stack,top);
        top = push(stack,top,60);
        display(stack,top);
        System.out.println("peek element is:");
        System.out.println(peek(stack,top));
        System.out.println("is Empty ? " + isEmpty(stack,top));
    }
    private static boolean isEmpty(int[] stack , int top){
        if (top == -1){
            return true;
        }
        return false;
    }
    private static int peek(int[] stack , int top){
        if (top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    private static int pop(int[] stack, int top) {
        if (top == -1){
            System.out.println("Stack is empty!!");
            return top;
        }
        System.out.println(stack[top] + " is popped");
        top--;
        return top;
    }

    private static void display(int[] stack, int top){
        if (top == -1){
            System.out.println("Stack is empty!!");
            return;
        }
        while (top >= 0){
            System.out.print(stack[top] + " ");
            top--;
        }
    }

    private static int push(int[] stack, int top, int value) {

        if (top == stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }
}
