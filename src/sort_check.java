import java.util.*;

public class sort_check {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        for(int i=0;i<size;i++)
        {
            numbers[i] = sc.nextInt();
        }
        boolean isAcending = false;

        for (int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i] < numbers[i+1])
            {
                isAcending = true;
            }

        }
        if(isAcending)
        {
            System.out.println(" sort acending order");
            return;
        }else {

            System.out.println("not sort acending order");
        }
    }

}
