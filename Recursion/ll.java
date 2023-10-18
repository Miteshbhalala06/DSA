public class ll {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,9,1};
        int n = arr.length-1;
        System.out.println(check_sorted(arr,n));
        System.out.println(power(2,10));

    }
    private static boolean check_sorted(int[] arr,int n){
        if (n == 0){
            return true;
        }

        if (arr[n] < arr[n-1]){
            return false;
        }

        return check_sorted(arr,n-1);

    }
    private static int power(int x,int n){
        if (n == 0){
            return 1;
        }
       return x * power(x, n-1);
    }

}
