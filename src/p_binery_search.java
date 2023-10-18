public class p_binery_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int value=6;
        int left=0, right= arr.length-1;


        while (left <= right)
        {
            int mid = (left + right) / 2;
//            System.out.println(mid);
            if(arr[mid]==value)
            {
                System.out.println("value is present");
                return;
            } else if (arr[mid]<value) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        System.out.println("value is not present");

    }
}
