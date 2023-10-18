import java.util.Arrays;

public class p_merge_in_one_array {
    public static void main(String[] args) {


        int arr1[]={1,3,4,9,10,11};
        int arr2[]={2,5,6,7,8};
        int new_arr[]=new int [arr1.length + arr2.length];

        int i=0,j=0,k=0;

        while (i<arr1.length && j< arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                new_arr[k]=arr1[i];
                i++;
                k++;
            }else {
                new_arr[k]=arr2[j];
                j++;
                k++;
            }

        }
//        System.out.println(i);
        while (i < arr1.length){
            new_arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            new_arr[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(new_arr));

    }
}
