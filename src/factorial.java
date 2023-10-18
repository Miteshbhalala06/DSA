import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        int result= facotrial( a);
        System.out.println("sum of two numbers is :"+result);
    }
    public static int facotrial(int a)
    {
        int temp =1;
        for(int i=a;i>=1;i--)
        {
            temp = temp * i;
        }
        return temp;
    }


}
