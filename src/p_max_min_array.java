public class p_max_min_array {
    public static void main(String[] args) {
        int array[]={11,10,9,17,15,22,21};

        int max=Integer.MIN_VALUE;
        int min=array[0];


        for(int i=0;i< array.length;i++)
        {
            if(array[i] > max)
            {
                max=array[i];
            } else if (array[i] < min) {
                min=array[i];
            }

        }

        System.out.println(max);
        System.out.println(min);




    }
}
