public class p_count_repeat_index {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,7,3,5,2,4,7,1,2,5,8,4,2,6,4,1,9,5,1,9,5};
        int ans[]=new int[10];
        int j=0;

        for (int i=0;i< arr.length;i++)
        {
            ans[arr[i]]=ans[arr[i]] + 1;
        }

        for (int i =0 ; i<ans.length ; i++) {
            System.out.print(j);
            j++;
            System.out.println("=" + ans[i]);
        }
    }
}
