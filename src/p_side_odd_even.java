public class p_side_odd_even {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};

        int left=0;
        int right=array.length-1;

        while(left<right)
        {
                if(array[left] % 2 ==0)
                {
                    left++;
                } else if (array[right] % 2 ==1) {
                    right--;

                }else {
                    int temp=array[left];
                    array[left]=array[right];
                    array[right]=temp;
                }
        }
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
