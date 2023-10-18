import java.util.*;
public class p_sum_of_array {
    public static  void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();


        int array []= new int[size];


        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i< array.length;i++)
        {
            sum=sum+array[i];
        }
        double average=sum / size;
        System.out.println(sum);
        System.out.println(average);

    }
}
