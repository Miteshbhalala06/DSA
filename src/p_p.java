import java.util.Arrays;
import java.util.Scanner;

public class p_p {
    public static void main(String[] args) {


//        int arr[]={20,10,8,40,32,17};
//
////        System.out.println(min2);
//        int min1=Integer.MAX_VALUE;
//        int min2=Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
////        for (int i=0;i<arr.length;i++){
//            for (int j=0;j< arr.length;j++)
//            {
//                if (arr[j]<min1){
//                    min2=min1;
//                    min1=arr[j];
////                    System.out.println(i + " " + j);
//
//                } else if (arr[j]<min2 && arr[j]!=min1) {
//                    min2=arr[j];
////                    System.out.println(i + " " + j);
//                }
//                else if(arr[j]>max){
//                    max = arr[j];
//                }
//            }
////        }
//        System.out.println(Math.abs(min1-min2));
//        System.out.println(Math.abs(max-min1));
//
        int nums[]={10,4,8,3};
        int ans[]=new int [nums.length];
        int leftsum[]=new int [nums.length];
        int rightsum[]=new int [nums.length];

        for(int i=0;i<nums.length-1;i++)
        {
            leftsum[i+1]=leftsum[i]+nums[i];
        }
        // int j=0;
        for(int i=nums.length-1;i>=1;i--) {
            rightsum[i - 1] = rightsum[i] + nums[i];
        }
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }

        System.out.println(Arrays.toString(ans));
    }}








