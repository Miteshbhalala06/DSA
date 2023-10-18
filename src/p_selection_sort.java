public class p_selection_sort {
    public static void main(String[] args) {
        int arr[]={7,8,5,6,1,4};
        int n= arr.length;

       for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            if (i != min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
