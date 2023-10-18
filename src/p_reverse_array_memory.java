
                        //Reverse an array in memory


public class p_reverse_array_memory {
    public static  void main (String args[])
    {
        int array[] = {10,20,30,40,50,60,70};

        int left=0;
        int right= array.length-1;
//
//        while (left < right)
//        {
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
//            left++;
//            right--;
//        }

        int k = 0;
        for (int j=array.length-1;k<j;j--){
            int temp=array[k];
            array[k]=array[j];
            array[j]=temp;
            k++;
        }

        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
