import java.util.Arrays;

public class p_left_rotate_arr_d_pos {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int ans[] = new int[arr.length];
        int d = 3;

        int j = 0;
        for (int i = d; i < arr.length; i++) {
//            System.out.println(arr[i]);
            ans[j++] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            ans[j++] = arr[i];

        }
        System.out.println(Arrays.toString(ans));
    }
}
