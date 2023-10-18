import java.util.Arrays;
public class test {
    public static void main(String args[]) {
        //Declare and initialize the array elements
        int arr[] = { 2, 3, 1, 4, 6 };
        // Print the array elements
        System.out.println("Array elements are: "+Arrays.toString(arr));
        //Declare an int variable 'product' to hold the product value
        int product = 1;
        //iterate the array elements and find the product of all elements
        for(int i=0;i<arr.length;i++) {
            product*=arr[i];
        }
        //Divide the total product value with the array element to be replaced
        for(int i=0;i<arr.length;i++) {
            arr[i] = product/arr[i];
        }
        //print the new array
        System.out.println("Updated array: "+Arrays.toString(arr));
    }
}