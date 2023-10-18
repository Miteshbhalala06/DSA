package Link_List;

public class All_algo {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size = 0;
    public void addFirst(int data){
        // step 1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        // step 2 - newnode next = head
        newNode.next = head;
        // step 3 - head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if (head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void addMiddle(int index,int data){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;

        while (count < index-1){
            temp = temp.next;
            count++;
        }
        //count = index-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;    // Not valid return
        } else
            if (size == 1) {
             int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0){
            System.out.println("LL is Empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int count = 0;
        while (temp != null){
            if (temp.data == key){
                System.out.println("Index:-");
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }
    public void reverseInMemory(){
        // need three varivable
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthNodeFromLast(int n) {
        int size = 0;
        Node temp = head;

        while (temp != null){
            temp = temp.next;
            size++;
        }

        if (n == size){
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = null;
        Node curr = head;
        while (i < (size - n) + 1){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is mid node
    }
    public boolean checkPalindrome(){
        if (head == null || head.next == null){
            return true;
        }
        // step 1 - find mid
        Node middNode = findMid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = middNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step - 3 check left half & right half
        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;


    }

    public static void main(String[] args) {
        All_algo ll = new All_algo();
//        ll.print();
//        ll.addFirst(2);
//        ll.print();
//        ll.addFirst(1);
//        ll.print();
//        ll.addLast(3);
//        ll.print();
//        ll.addLast(4);
//        ll.print();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addMiddle(2,100);
        ll.print();
//        ll.removeFirst();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.itrSearch(3000));
//        ll.reverseInMemory();
//        ll.print();
//        ll.deleteNthNodeFromLast(3);
//        ll.print();
        System.out.println(ll.checkPalindrome());


    }


}
