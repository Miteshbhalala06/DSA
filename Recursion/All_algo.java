public class All_algo {
    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(fibonacci(n));

//        int arr[] = {8,3,6,15,10,2,5};
//        int key = 5;
//        System.out.println(findOccurrence(arr,0,key));

        int arr[] = {5,5,5,5,5};
        int key = 5;
        System.out.println(findOccurrenceLast(arr,arr.length-1,key));
    }
    //------------fibonacci num-----------------
    private static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //---------------------First occurance of element--------------------
    private static int findOccurrence(int[] arr,int i,int key){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return findOccurrence(arr,i+1,key);
    }
    //---------------------Last occurance of element--------------------
    private static int findOccurrenceLast(int[] arr,int i,int key){
        if (i == -1){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return findOccurrenceLast(arr,i-1,key);

    }


}
