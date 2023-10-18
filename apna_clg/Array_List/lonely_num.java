package Array_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lonely_num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        int ans[] = new int[arr.size()];
//        ArrayList<Integer> ans = new ArrayList<>();
        arr.add(10);  // [ 5,6,8,10]
        arr.add(6);
        arr.add(5);
        arr.add(8);
        System.out.println(findLonely(arr));

    }
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
            {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }

}