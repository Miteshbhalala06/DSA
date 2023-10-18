public class p_miss_number {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,4,5,6};
        int n=arr.length-1;
        int sum=0;
        int find = n*(n+1)/2; //21

        for(int i=0;i< arr.length;i++)
        {
//            System.out.println(arr);
            sum=sum+arr[i];
        }
        System.out.println(sum-find);
        System.out.println(find);
        System.out.println(sum);

//        int arr[]  = {1,2,3,5,6};
//        int n = arr.length+1;
//        int sum = 0;
//        int find = n*(n+1) / 2;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
//
//        System.out.println(find - sum);

    }
}
