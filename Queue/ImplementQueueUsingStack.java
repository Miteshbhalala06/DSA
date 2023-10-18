import java.util.Stack;

public class ImplementQueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        print();
    }
    public static void push(int value){
        while (!s1.empty()){
            s2.add(s1.pop());
        }
        s1.push(value);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public static void print(){
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
