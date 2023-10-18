public class print_arr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        print_arr(arr,arr.length-1);
    }
    private static void print_arr(int[] arr,int n){
        if (n == -1){
            return;
        }
        print_arr(arr,n-1);
        System.out.print(arr[n]+" ");
    }
}
