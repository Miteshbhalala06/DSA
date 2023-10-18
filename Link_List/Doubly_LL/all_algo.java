package Doubly_LL;

public class all_algo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.insert(10);
//        linkedList.insert(20);
//        linkedList.insert(20);
//        linkedList.insert(30);
//        linkedList.insert(40);
//        linkedList.insert(40);
//        linkedList.insert(40);
//        linkedList.insert(50);
//        linkedList.delete(30);
//        System.out.println();
//        linkedList.rev_In_mem();
//        System.out.println();
//        linkedList.print();
//        linkedList.rev_print();
//        linkedList.sum_Pair(70);
//        linkedList.sortInsert(35);
//        System.out.println();
//        linkedList.removeDuplicate();
        linkedList.insert(50);
        linkedList.insert(50);
        linkedList.insert(40);
        linkedList.insert(40);
        linkedList.insert(30);
        linkedList.insert(50);
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(10);
        linkedList.print();
        linkedList.removeUnsorted_Dup();
        System.out.println();
        linkedList.print();
//        linkedList.rev_print();



    }
}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int data){
        Node nn = new Node(data);

        if (head == null){
            head= nn;
            tail=nn;
        }else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public void rev_print(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.prev;
        }
    }

     public void delete(int value) {
        if (head.data == value && head == tail){
            head = null;
            tail = null;
        }else if (head.data == value){
            head.next.prev = null;
            head = head.next;
        }else {
            Node prev = head;
            Node curr = head.next;
            while (curr.data != value){
                prev = curr;
                curr = curr.next;
            }
            if (curr.next == null){
                prev.next = null;
                tail = curr.prev;
            }else {
                curr.next.prev = curr.prev;
                prev.next = prev.next.next;
            }
        }
    }

    public void rev_In_mem() {
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = curr.prev;
            curr.prev = next;
            curr = next;
        }
        Node temp;
        temp = head;
        head = tail;
        tail = temp;
    }

    public void sum_Pair(int key) {
        Node left = head;
        Node right = tail;
        int sum = 0;
        while (left != right ){
            sum = left.data + right.data;
            if (sum == key){
                System.out.println("Pair :-"+ left.data +" "+ right.data);
                left = left.next;
                right = right.prev;
            }else if (sum < key){
                left = left.next;
            }else {
                right = right.prev;
            }
        }

    }
    public void sortInsert(int value){
        Node nn = new Node(value);
        Node curr = head;

        while (curr != null){
            if (curr.data >= value){
                nn.next = head;
                head.prev = nn;
                head = nn;
                return;
            }else {
                if (curr == tail){
                    nn.prev = curr;
                    curr.next = nn;
                    tail = nn;
                    return;
                }
                else if (curr.data <= value && curr.next.data >= value) {
                    nn.next = curr.next;
                    nn.next.prev = nn;
                    nn.prev = curr;
                    curr.next = nn;
                    return;
                }
            }
            curr = curr.next;
        }
    }

    //    # Remove duplicates from a sorted doubly linked list
    public void removeDuplicate() {
        Node cur = head;
        while(cur != null) {
            Node temp = cur;
            while (temp.data == cur.data) {
                if(temp.next == null) {
                    cur.next = null;
                    return;
                }
                temp = temp.next;
            }
            temp.prev = cur;
            cur.next = temp;
            cur = cur.next;
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
                    if(index.next != null) {
                        index.next.prev = temp;
                    }else if (index.next == null){
                        tail = temp;
                    }
                }
                else {
                    temp = index;
                }
                index = index.next;
            }
            cur = cur.next;
        }
    }
}

class Node{
    int data;
    Node next,prev;

    public Node(int data){
        this.data = data;
    }
}