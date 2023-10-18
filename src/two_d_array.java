import java.util.*;

public class two_d_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers [][] = new int[rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();


        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
//                System.out.print(numbers[i][j] + " ");
                  if (numbers[i][j] == x)
                  {
                      System.out.println(" number index at "+i + " " + j);
                  }
            }
            System.out.println();
        }



    }

}
