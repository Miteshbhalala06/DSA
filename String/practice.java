import java.util.Arrays;
import java.util.*;

public class practice {
    public static void main(String[] args) {

        String s = "seven";
        char arr[] = s.toCharArray();

        int left = 0 , right = arr.length-1;

        while (left < right){

            if (arr[left] != arr[right]){
                char min=(char)Math.min((int)arr[left],(int)arr[right]);
                arr[left]=min;
                arr[right]=min;
            }


            left++;
            right--;
        }

        String s1 = new String(arr);
        System.out.println(s1);


    }
}
