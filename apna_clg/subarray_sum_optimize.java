public class subarray_sum_optimize {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int max=subArraySum(arr);
        System.out.println(max);

    }
    public static int subArraySum(int arr[]){

        int max = Integer.MIN_VALUE;

        int prefix[]=new int [arr.length];
        prefix[0]=arr[0];
        for (int i=1;i< arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for (int i=0;i<arr.length;i++){
            int start=i;
            for (int j=0;j<arr.length;j++){
                int end =j;

                int currentsum = i==0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max < currentsum){
                    max = currentsum;
                }
            }
        }
        return max;
    }

}
