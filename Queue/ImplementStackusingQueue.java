import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueue {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        print();

    }
    public static void push(int value){
        q1.add(value);
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }

    }
    public static void print(){
        while (!q2.isEmpty()){
            System.out.println(q2.remove() +" ");
        }

    }
}
