import java.lang.reflect.Array;
import java.util.Arrays;

public class L_pair_2006 {
    public static void main(String[] args) {
        int nums[]={6,5,4,8};
        int count=0;
        int k=0;
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j != i && nums[i]>nums[j])
                {
                    count++;
                }
//                System.out.print(count);
            }
            nums[i]=count;
        }

        System.out.println(Arrays.toString(nums));
    }
}
