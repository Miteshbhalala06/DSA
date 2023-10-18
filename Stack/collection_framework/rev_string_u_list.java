package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class rev_string_u_list {
    public static void main(String[] args) {

//         # ArrayList
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//
//        System.out.println(arr);
//
//        for(int i=0; i<arr.size(); i++){        //to print individual element
//            System.out.println(arr.get(i));
//        }
//
//        for(int ele : arr){
//            System.out.print(ele +" ");
//        }

        //        # List with matrix
//        List<List<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>());
//        matrix.add(new ArrayList<>());
//
//        matrix.get(0).add(1);
//        matrix.get(0).add(2);
//        matrix.get(0).add(2);
//        matrix.get(1).add(3);
//        matrix.get(1).add(4);
//
//        System.out.println(matrix);

        //        1) reverse string using Collection stack --------------------------------------------------------

//        String s = "hello";
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i));
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop()+" ");
//        }

        //        2) Reverse individual words using stack

//        String s = "hello how are you";
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' '){
//                while (!stack.isEmpty()){
//                    System.out.print(stack.pop());
//                }
//                System.out.print(" ");
//            }else {
//                stack.push(s.charAt(i));
//            }
//        }
//
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop());
//        }

        //        3) Check if string is palindrome or not using stack

//        String s1 = "nitin";
//        String s2 = "";
//
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s1.length(); i++) {
//            stack.push(s1.charAt(i));
//        }
//
//        while (!stack.isEmpty()){
//            s2+=stack.pop();
//        }
//
//        if (s1.equals(s2)){
//            System.out.println("String is palindrome");
//        }else {
//            System.out.println("String is not palindrome");
//
//        }

        //  4) Delete middle element of a stack

        int n = 12345;
        Stack<Integer> stack = new Stack<>();
        int count = -1;
        int res = 0;

        while (n != 0){
            int d = n % 10;
            stack.push(d);
            n /= 10;
            count++;
        }

        int mid = stack.size()/2;

        while (!stack.isEmpty()){
            if (mid != count){
                res = (res * 10) + stack.peek();
            }
            stack.pop();
            count--;

        }
        System.out.println(res);


    }
}
