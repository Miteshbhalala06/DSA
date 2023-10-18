//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//class Tree_traverse{
//    static int count = 0;
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        Node nn = new Node(10);
//        bt.root = nn;
//        nn.left = new Node(20);
//        nn.right = new Node(30);
//        nn.left.left = new Node(40);
//        nn.left.right = new Node(50);
//        nn.right.left = new Node(60);
//        nn.right.right = new Node(70);
//
//
////        System.out.println("level-Order-Traversal :- ");
////        bt.levelOrderTraversal();
////        System.out.println();
////        System.out.println("Pre-Order-Traversal :- ");
////        bt.preOrder();
////          bt.printPreStack(bt.root);
////        System.out.println("In-Order-Traversal :- ");
////        bt.inOrder();
////        bt.printInStack(bt.root);
////        System.out.println("Post-Order-Traversal :- ");
////        bt.postOrder();
////        bt.printPostStack(bt.root);
////        System.out.println();
//
//        System.out.println("Total Nodes : "+ countNodeInBT(bt.root));
////        nthNodeFromInOrder(bt.root,2);
////        System.out.println(height(bt.root));
////        System.out.println("Find Node : " + findNode(bt.root,3000));
////          spiral(bt.root);
//
//    }
//    public static int countNodeInBT(Node root){
//        if (root == null){
//            return 0;
//        }else {
//            count++;
//        }
//        countNodeInBT(root.left);
//        countNodeInBT(root.right);
//
//        return count;//        return 1 + countNodeInBT(root.left) + countNodeInBT(root.right);
//
//    }
//
//    public static void nthNodeFromInOrder(Node root,int i){
//        if (root == null){
//            return;
//        }
//        nthNodeFromInOrder(root.left,i);
//        count++;
//        if (count == i){
//            System.out.println(root.data);
//            return;
//        }
//        nthNodeFromInOrder(root.right,i);
//    }
//
//    public static int height(Node root){
//
//        if (root == null){
//            return 0;
//        }
//        int LHeight = height(root.left);
//        int RHeight = height(root.right);
//
//        return 1 + Math.max(LHeight,RHeight);
//
//    }
//
//    public static boolean findNode(Node root , int val){
//        if (root == null){
//            return false;
//        }
//        if (root.data == val){
//            return true;
//        }
//        return findNode(root.left,val) || findNode(root.right,val);
//    }
//    public static void spiral(Node root){
//        Deque<Node> dequeue = new LinkedList<>();
//        boolean isRev = false;
//        dequeue.add(root);
//        while (! dequeue.isEmpty()){
//            if (isRev){
//                int size = dequeue.size();
//                while (size > 0){
//                    Node node = dequeue.removeLast();
//                    System.out.print(node.data+" ");
//
//                    if (node.right != null){
//                        dequeue.addFirst(node.right);
//                    }
//                    if (node.left != null){
//                        dequeue.addFirst(node.left);
//                    }
//                    size--;
//                }
//                System.out.println();
//                isRev =! isRev;
//
//            }else {
//                int size = dequeue.size();
//                while (size > 0){
//                    Node node = dequeue.removeFirst();
//                    System.out.print(node.data +" ");
//
//                    if (node.left != null){
//                        dequeue.addLast(node.left);
//                    }
//
//                    if (node.right != null){
//                        dequeue.addLast(node.right);
//                    }
//                    size--;
//                }
//                System.out.println();
//                isRev = !isRev;
//            }
//        }
//    }
//}
//class BinaryTree{
//    Node root;
//
//    public void levelOrderTraversal(){
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            Node node = queue.poll();
//            System.out.print(node.data+" ");
//            if (node.left != null){
//                queue.add(node.left);
//            }
//            if (node.right != null){
//                queue.add(node.right);
//            }
//        }
//
//    }
//    public void preOrder(){
//        printUsingRecPre(root);
//    }
//    public void printUsingRecPre(Node root){
//        if (root == null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        printUsingRecPre(root.left);
//        printUsingRecPre(root.right);
//    }
//    //    # pre-order without recursion  -----------------------
//
//    public void printPreStack(Node root){
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            Node node = stack.pop();
//            System.out.print (node.data+" ");
//
//            if (node.right != null){
//                stack.push(node.right);
//            }
//            if (node.left != null){
//                stack.push(node.left);
//            }
//        }
//    }
//
//
//    public void inOrder(){
//        printUsingRecIn(root);
//    }
//    public void printUsingRecIn(Node root){
//        if (root == null){
//            return;
//        }
//        printUsingRecIn(root.left);
//        System.out.print(root.data+" ");
//        printUsingRecIn(root.right);
//    }
//    //    # in order without recursion  --------------------
//    public void printInStack(Node root){
//        Stack<Node> stack = new Stack<>();
//        Node  node = root;
//
//        while (!stack.isEmpty() || node != null){
//            while (node != null){
//                stack.push(node);
//                node = node.left;
//            }
//            node = stack.pop();
//            System.out.print(node.data+" ");
//            node = node.right;
//        }
//    }
//
//
//
//    public void postOrder(){
//        printUsingRecPost(root);
//    }
//    public void printUsingRecPost(Node root){
//        if (root == null){
//            return;
//        }
//        printUsingRecPost(root.left);
//        printUsingRecPost(root.right);
//        System.out.print(root.data +" ");
//    }
//    //    # post order without recursion -----------------------
//
//    public void printPostStack(Node root){
//        Stack<Node> stack1 = new Stack<>();
//        Stack<Node> stack2 = new Stack<>();
//        stack1.push(root);
//
//        while (!stack1.isEmpty()){
//            Node node = stack1.pop();
//            stack2.push(node);
//
//            if (node.left != null){
//                stack1.push(node.left);
//            }
//            if (node.right != null){
//                stack1.push(node.right);
//            }
//        }
//        while (!stack2.isEmpty()){
//            System.out.print(stack2.pop().data+" ");
//        }
//
//
//    }
//
//
//
//
//}
//class Node{
//    int data;
//    Node left,right;
//    Node(int data){
//        this.data = data;
//    }
//}