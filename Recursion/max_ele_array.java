public class max_ele_array {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,15,6,7,8,9,10};

        print(arr,arr.length-1);
        System.out.println(max);
    }
    private  static void print(int[] arr,int n){
        if (n == -1){
            return;
        }
        if (max < arr[n]) {
            max = arr[n];
        }
        print(arr,n-1);
    }
}
