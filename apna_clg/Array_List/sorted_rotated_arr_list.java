package Array_List;

import java.util.ArrayList;

public class sorted_rotated_arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(10);

        System.out.println(pairsum(arr,24));
    }

    public static boolean pairsum(ArrayList<Integer> arr, int value){
        int n = arr.size();
        int bp = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i+1)){
                bp = i;
                break;
            }
        }
        int right = bp;   //largest
        int left = bp+1; //smallest

        while (left != right){
            if (arr.get(left) + arr.get(right) == value){
                return true;
            } else if (arr.get(left) + arr.get(right) < value) {
                left = (left + 1) % n;
            }else {
                right = (n + right - 1) % n;
            }

        }
        return false;
    }
}
