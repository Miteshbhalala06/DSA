public class subarray_sum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int max=subArraySum(arr);
        System.out.println(max);

    }
    public static int subArraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int start=i;
            for (int j=0;j<arr.length;j++){
                int end=j;
                int sum=0;
                for (int k=start;k<=end;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                if (max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
}
