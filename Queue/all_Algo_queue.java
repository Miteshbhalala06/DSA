public class all_Algo_queue {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;


    public static void main(String[] args) {
        enqueue(10);
        System.out.println("size is: " + size());
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        print();
        System.out.println("size is: " + size());
        System.out.println(peek());
    }
    private static int peek(){
        if (isEmpty()){
            return -1;
        }
        return queue[front];
    }
    private static int size(){
        return rear - front;
    }
    private static void print(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }else {
            for (int i = front+1; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
        }

    }



    private static void dequeue() {
        if(isEmpty()){
            System.out.println("queue is empty , can't deque");
            return;
        }
        front++;
        System.out.println(queue[front] +" "+"deleted:");

    }
    private static boolean isEmpty(){
        if (rear == -1 || front == rear){
            return true;
        }
        return false;
    }

    private static void enqueue(int value){
        if (rear == queue.length-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
    }

}
