
//Two numbers are entered by the user, x and n. Write a function to find
// the value of one number raised to the power of another i.e. xn.
import java.util.*;

public class apnacle_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int x = sc.nextInt();
        int n = sc.nextInt();

        int c= power( x, n);
        System.out.println(c);


        }
    public static int power(int x,int n)
    {
        int temp=1;
        for(int i=1;i<=n;i++){
//            x=x * n;
            temp=temp * x;
        }
        return x;

    }



}
