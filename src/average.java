import java.util.*;

public class average {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        int result=  Average(a);
        System.out.println(result);

    }
    public static int Average(int a)
    {
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            if(i % 2==1){
                sum=sum+i;
            }

        }
        return sum;
    }




}
