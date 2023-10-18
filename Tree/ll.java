import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ll {
   static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.right = new Node(6);


        ArrayList<Integer> list = new ArrayList<>();
        ans.add(bt.inOrder(list,bt.root));
        list = new ArrayList<>();
        ans.add(bt.preOrder(list,bt.root));
        list = new ArrayList<>();
        ans.add(bt.postOrder(list,bt.root));
        System.out.println(ans);


    }
}
class BinaryTree{
    Node root;


    public ArrayList<Integer> inOrder(ArrayList<Integer> list, Node root){

        if (root == null){
            return list;
        }
        inOrder(list,root.left);
        list.add(root.data);
        inOrder(list,root.right);
        return list;
    }

    public ArrayList<Integer> preOrder(ArrayList<Integer> list, Node root){
        if (root == null){
            return list;
        }

        list.add(root.data);
        inOrder(list,root.left);
        inOrder(list,root.right);
        return list;
    }

    public ArrayList<Integer> postOrder(ArrayList<Integer> list, Node root){
        if (this.root == null){
            return list;
        }

        inOrder(list, this.root.left);
        inOrder(list, this.root.right);
        list.add(this.root.data);
        return list;
    }

}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
    }
}
