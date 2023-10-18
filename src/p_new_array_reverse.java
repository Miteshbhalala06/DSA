
                                //store array in reverse order in new array
public class p_new_array_reverse {
    public static  void main (String args[])
    {
        int array[] = {10,20,30,40,50,60,70};
        int new_array[] = new int[array.length];

        int j=0;
        for(int i= array.length-1;i >= 0;i--)
        {
            new_array[j]= array[i];
            j++;
        }

        for(int i=0;i< new_array.length;i++)
        {
            System.out.println(new_array[i]);
        }


    }
}
