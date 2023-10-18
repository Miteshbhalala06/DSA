import java.util.Arrays;

public class p_bubble_sort {
    public static void main(String[] args) {
    int arr[]={5,3,1,2,4};
    int n= arr.length;

    for (int i=0;i<3;i++)
    {
        for (int j=0;j<2;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for (int i=0;i<n;i++)
    {
        System.out.print(arr[i] + " ");
    }
    }
}
