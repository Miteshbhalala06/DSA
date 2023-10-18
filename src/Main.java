//            Pair with sum present or not? Two pointers


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=5;j>=i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int arr[] = {1, 2, 3, 4, 5, 6};
//        int d=2;
//        int[] temp = new int[arr.length];
//
//        int j=0;
//        for (int i=d;i<arr.length;i++)
//        {
//            temp[j]=arr[i];
//            j++;
//        };
//
//        for(int i=0; i<d; i++){
//            temp[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(temp));


    int nums[] = {1,15,6,3};
        int sum=0;
        int d_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            while(nums[i] != 0)
            {
                int rem = nums[i]%10;
                d_sum = d_sum + rem;
                nums[i] = nums[i]/10;
            }
        }
        int ans =sum - d_sum;
        System.out.println(ans);


    }
}