//Write a Java program to remove a specific element from an array.

import java.util.*;
public class remove_ele_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

    //        int array[]= {10,20,30,40,50,60,70};

        int array[]=new int [size];
//        int p=size-1;

        for(int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();

        }

        System.out.println("which number you want to remove ");

        int num = sc.nextInt();

        for(int i=0;i< array.length;i++)
        {
            if(array[i]==num)
            {
//                System.out.println(i);
                for(int j=i;j< array.length-1;j++)
                {
                    array[j] = array[j+1];
                }
                break;


            }

        }

        for(int i=0;i< array.length-1;i++)
        {
            System.out.print(array[i] + " ");
        }



    }

}
