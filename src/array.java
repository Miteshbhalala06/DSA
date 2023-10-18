import java.util.*;

public class array {
    public static void main(String args[])
    {
//        int marks[] = new int[3];
//        marks[0]=10;
//        marks[1]=20;
//        marks[2]=30;
//        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        for(int i=0;i<size;i++)
        {
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(numbers[i]);
        }

    }

}
