public class p_insertion_sort {
    public static void main(String[] args) {
        int arr[]={5,6,23,4,5,6};
        int n= arr.length;

        for (int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
//        for (int i=1;i<n;i++)
//        {
//            int temp=arr[i];
//            int j;
//            for ( j=i-1;j>=0 && temp<arr[j];j--)
//            {
//                    arr[j+1]=arr[j];
//            }
//            arr[j+1]=temp;
//
//        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
