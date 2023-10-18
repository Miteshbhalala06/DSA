
//Write a Java program to insert an element (specific position) into an array.

import java.util.*;
public class insert_ele_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int array[]= {10,20,30,40,50,60,70};
        int index_position = sc.nextInt();
        int num = sc.nextInt();

        for (int i= array.length-1;i>index_position;i--)
        {
            array[i]=array[i-1];
        }
        array[index_position]=num;

        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}
