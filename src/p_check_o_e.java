

                            //1..Count odd / even in array

public class p_check_o_e {
    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,6,7};
        int even_counter=0;
        int odd_counter=0;

        for(int i=0;i< array.length;i++)
        {
            if(array[i] % 2 == 0)
            {
                even_counter++;
            }else {
                odd_counter++;
            }
        }
        System.out.println(even_counter);
        System.out.println(odd_counter);

    }

}
