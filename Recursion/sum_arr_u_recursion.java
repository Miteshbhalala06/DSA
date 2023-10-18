public class sum_arr_u_recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        System.out.println(sum(arr,arr.length-1));
        System.out.println(find(arr,arr.length-1,6));
    }
    private static int sum(int[] arr,int n){
        if (n == -1){
            return 0;
        }
        return arr[n] + sum(arr,n-1);
    }
    private static boolean find(int[] arr,int n,int key){
        if (n == -1){
            return false;
        }
        if (arr[n] == key){
            return true;
        }
        return find(arr,n-1,key);

    }
}
