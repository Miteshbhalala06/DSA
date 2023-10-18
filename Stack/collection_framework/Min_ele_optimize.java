package collection_framework;

import java.util.Stack;

public class Min_ele_optimize {
    static  Stack<Integer> MainStack = new Stack<>();
    static  Stack<Integer> MinStack = new Stack<>();

    public static void main(String[] args) {

        push(10);
        push(5);
        push(15);
        push(2);
        pop();
        System.out.println(getMin());
    }
    static int getMin(){
        return MinStack.peek();
    }
    static void pop(){

        if (MainStack.peek() == MinStack.peek()){
            MinStack.pop();
        }
        MainStack.pop();

    }
     static void push(int value){
        MainStack.push(value);
        if (MinStack.isEmpty() || value < MinStack.peek()){
            MinStack.add(value);
        }
    }
}
