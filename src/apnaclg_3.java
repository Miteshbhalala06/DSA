
//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class apnaclg_3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        big(a,b);

    }

    public static void big(int a, int b) {
        if (a > b) {
            System.out.println("number a is big");
        } else {
            System.out.println("number b is big");
        }
    }
}



