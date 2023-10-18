
//Given an array arr, create another array arr2 with double the size of arr, create another array arr2 with all value twice
public class p_arr_twice {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int new_arr[]=new int [arr.length*2];

        int j=0;

        for(int i=0;i< arr.length;i++)
        {
          new_arr[j++]=arr[i];
          new_arr[j++]=arr[i];
        }

        for(int i=0;i< new_arr.length;i++)

        {
            System.out.print(new_arr[i] + " ");
        }
    }
}
