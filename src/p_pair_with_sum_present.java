public class p_pair_with_sum_present {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8};
        int value = 8;

       int left = 0 ;
       int rigjt = arr.length-1;

       while (left < rigjt){
           if (arr[left] + arr[rigjt] == value){
               System.out.println("present : " + arr[left] +" "+ arr[rigjt]);
               left++;
               rigjt--;
//               return;
           }else if (arr[left] + arr[rigjt] > value){
               rigjt--;
           }else {
               left++;
           }
       }
        System.out.println("not present ");
    }
}
