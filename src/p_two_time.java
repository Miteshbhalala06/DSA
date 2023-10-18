
//Given an array arr, create another array arr2 with double the size of arr and copy arr element two times in arr2

public class p_two_time {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,};
        int new_arr[]=new int[arr.length*2];

        int j=0;
        int n= arr.length;
        for(int i=0;i< arr.length;i++)
        {
            new_arr[j]=arr[i];
            new_arr[j+n]=arr[i];
            j++;
        }

//        for(int i=0;i< arr.length;i++)
//        {
//            new_arr[j]=arr[i];
//            j++;
//        }

        for(int i=0;i< new_arr.length;i++)
        {
            System.out.print(new_arr[i] + " ");
        }
    }
}
