public class two_arr_asecending_merge {
    public static void main(String[] args) {
        int arr1[]= {2,6,8,10};
        int arr2[]= {1,3,4,5,11,12,13,14};
        int arr3[] = new int[arr1.length*2];

        int i,j=0
                ,k=0;

//        while (i<arr1.length && j< arr2.length)
//        {
//            if(arr1[i]<arr2[j])
//            {
//                arr3[k]=arr1[i];
//                i++;
//            }else {
//                arr3[k]=arr2[j];
//                j++;
//            }
//            k++;
//
//        }
//        while (i < arr1.length){
//            arr3[k]=arr1[i];
//            i++;
//            k++;
//        }
//        while (j < arr2.length){
//            arr3[k]=arr2[j];
//            j++;
//            k++;
//        }

        for ( i=0;i< arr1.length;i++){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
            }else {
                arr3[k]=arr2[j];
            }
        }

        for(int p=0;p< arr3.length;p++){
            System.out.print(arr3[p] + " ");
        }

    }
}
