public class All_sort_algo {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6,7,8};
//        int arr[] = {8,7,6,5,4,2,1};
//        int arr[]={5,4,1,3,2};
        int arr[]={1,4,1,3,2,4,3,7};
//        bubbleSort(arr);
//        selactionSort(arr);
//        insertionSort(arr);
        countingSort(arr);
        print(arr);

    }

    public static void bubbleSort(int arr[]){
        int n= arr.length;

        for (int i=0;i<n-1;i++){
//            int swap=0;       swap variable is use for check ascending for one iteration and then return

            for (int j=0;j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
//                    swap++;
                }
            }
//            if (swap ==0){
//                return;
//            }
        }
    }

    public static void selactionSort(int arr[]){
        int n= arr.length;

        for (int i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            if(i != min){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }

    }

    public static void insertionSort(int arr[]){

        int n= arr.length;
        for (int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int [largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
