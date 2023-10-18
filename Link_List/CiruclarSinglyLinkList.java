public class CiruclarSinglyLinkList {
    public static void main(String[] args) {
        CiruclarSinglyLinkList cl = new CiruclarSinglyLinkList();
        cl.insert(10);
        cl.insert(20);
        cl.insert(30);
        cl.print();
        System.out.println(cl.check_Circular() ? "yes" : " No");
        cl.count_Node_cir();

    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node head;
    static Node tail;
    public void insert(int data){
        Node nn = new Node(data);
        if (head == null){
            head=tail=nn;
            tail.next = head;
        }else {
            tail.next=nn;
            tail=nn;
            tail.next=head;
        }
    }

    public boolean check_Circular() {
//        Node temp = head;
//        while (temp != null){
//            temp = temp.next;
//            if (temp == head){
//                return true;
//            }
//        }
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
    public void count_Node_cir(){
//        Node temp = head;
//        int count = 0;
//
//        while (temp != null){
//            temp = temp.next;
//            count++;
//            if (temp == head){
//                break;
//            }
//        }
        Node slow = head;
        Node fast = head;
        int count =0;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;

            if (slow == fast){
                break;
            }
        }
        System.out.println("size of circular LL :" + count);
    }
    public void print(){
        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//            if (temp == head){
//                break;
//            }
//        }
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } while (temp != head);

//        while (temp != tail){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println(temp.data);
    }

}
