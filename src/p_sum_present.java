public class p_sum_present {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6};

//        for (int i=0;i< arr.length;i++)
//        {
//            for (int j=i+1;j< arr.length;j++)
//            {
//                if(arr[i] + arr[j] == key)
//                {
//                    System.out.println(arr[i] + "and " + arr[j]);
//                }
//            }
//        }
        int arr[]={1,2,3,4,5,6};
        int left=0;
        int right= arr.length-1;
        int key=2;
        while (left<right){
            if (arr[left] + arr[right]==key){
                System.out.println("pair is present");
                return;
            } else if (arr[left] + arr[right] < key) {
                left++;
            }else {
                right--;
            }

        }
        System.out.println("not present");
//        System.out.println();
//        for (int i=0;i< arr.length;i++)
//        {
//            if(arr[i]==key)
//            {
//                System.out.println("present");
//                return;
//            }
////            else {
////                System.out.println("not");
////            }
//        }
//        System.out.println("not");




    }
}
