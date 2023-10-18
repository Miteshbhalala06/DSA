
//Arr1, arr2 same size -> arr3 alternative

public class p_alternate_array {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,};
        int arr_2[]={6,7,8,9,10};
        int arr_3[]=new int[arr.length+arr_2.length];

        int j=0;
        for(int i=0;i< arr.length;i++)
        {
            arr_3[j]=arr[i];
            arr_3[j+1]=arr_2[i];
            j++;
            j++;
        }

        for(int i=0;i< arr_3.length;i++)
        {
            System.out.print(arr_3[i] + " ");
        }


    }
}
