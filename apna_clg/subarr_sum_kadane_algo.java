public class subarr_sum_kadane_algo {
    public static void main(String[] args) {
        int arr[]={-1,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }

    public static void kadane(int arr[]){
        int csum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            csum += arr[i];

            if (csum < 0){
                csum = 0;
            }
//            if (max < csum){
//                max=csum;
//            }
            max = Math.max(csum , max);
        }
        System.out.println(max);
    }
}
