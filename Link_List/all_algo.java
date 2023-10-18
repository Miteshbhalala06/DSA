import java.util.Stack;

public class all_algo {
    public static void main(String[] args) {
       LinkedList linkedList = new LinkedList();
//
        linkedList.insert(10);
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(40);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.print();
//        linkedList.size;
//        linkedList.delete(30);
//        linkedList.update(30,3000);
//        System.out.println(linkedList.find(3000));
//        linkedList.print();
//        System.out.println(linkedList.size());
//        linkedList.reverse();
//        linkedList.getNode(2);
//        System.out.println(linkedList.getLastNode(2));
//        linkedList.deleteNotHead(linkedList.head.next.next);
//        linkedList.print();
//        linkedList.middleNode();
//        linkedList.rev_in_memory();
//        linkedList.check_Circular();
//        linkedList.tail.next = linkedList.head.next;
//        System.out.println(linkedList.isLoopDetected());
//        System.out.println(linkedList.loop_Length());
//          linkedList.insert(50);
//          linkedList.insert(50);
//          linkedList.insert(40);
//          linkedList.insert(40);
//          linkedList.insert(30);
//          linkedList.insert(50);
//          linkedList.insert(10);
//          linkedList.insert(20);
//          linkedList.insert(10);
//        linkedList.removeDuplicates();
//        linkedList.removeUnsorted_Dup();
//        System.out.println();
//        linkedList.print();
    }
}
class LinkedList{
    Node head;
    Node tail;

    public boolean find(int value){
        Node temp = head;
        while (temp != null){
            if (temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return  false;
    }
    public void update(int oValue,int nValue){
        Node temp = head;
        while (temp != null){
            if (temp.data == oValue){
                temp.data = nValue;
                break;
            }
            temp = temp.next;
        }

    }
    public void delete(int value){
        if (head.data == value && head == tail){
            head = null;
            tail = null;
        }else if (head.data == value){
            head = head.next;
        }else {
            Node prev = head;
            Node curr = head.next;
            while (curr.data != value){
                prev = curr;
                curr = curr.next;
            }
            prev.next = prev.next.next;

        }
    }
    public void insert(int data){
//        Node nn = new Node();
//        nn.data = data;
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            tail = nn;
        }else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public int size() {
        int count = 0;
        Node  temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void reverse(){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    // # Get nth Node from Linklist

    public void getNode(int value){
        int count = 1;
        Node temp = head;

//        while (temp != null){
//            if (count == value){
//                return temp.data;
//            }
//            count++;
//            temp = temp.next;
//        }
        while (count != value){
            count++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("get n th node :" + temp.data);
    }

    // # Get nth Last Node from Linklist

    public int getLastNode(int value){
        int count = 1;
        Node temp = head;
        while (temp != null){
            if (count == size() - value + 1){
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }


    public void deleteNotHead(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    public void middleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("midd ele :" + slow.data);
    }
    public void removeDuplicates(){
        Node curr = head;

        while (curr != null){
            Node temp = curr;  // Node temp = curr.next

            while (temp != null && temp.data == curr.data){
                    temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
    public void removeUnsorted_Dup() {
        Node cur = head;
        while(cur != null) {
            Node temp = cur;
            Node index = cur.next;
            while(index != null) {
                if(cur.data == index.data) {
                    temp.next = index.next;
                }
                else {
                    temp = index;
                }
                index = index.next;
            }
            cur = cur.next;
        }
    }


    public void rev_in_memory() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    public boolean isLoopDetected() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public int loop_Length() {
        Node slow = head;
        Node fast = head;
        int count = 0;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;

            if (fast == slow){
                return count;
            }
        }
        return 0;
//        int count= 0;
//        Node temp = tail;
//        do {
//            temp = temp.next;
//            count++;
//        }while (temp != tail);
//        return count;
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
