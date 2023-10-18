package Array_List;

import java.util.ArrayList;

public class store_water {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(storeWater(arr));
    }

//    public static int storeWater(ArrayList<Integer> height){
//
//        // o(n^2) time complaxity
//
//        int maxWater = 0;
//        for (int i = 0; i < height.size(); i++) {
//            for (int j = i+1; j < height.size(); j++) {
//                int ht = Math.min(height.get(i) , height.get(j));
//                int width = j-i;
//                int currWater = ht * width;
//                 maxWater = Math.max(maxWater , currWater);
//
//            }
//
//        }
//        return maxWater;
//    }

    public static int storeWater(ArrayList<Integer> heights){
        int maxWater = 0;
        int left = 0;
        int right = heights.size()-1;

        while (left < right){
            int ht = Math.min(heights.get(left),heights.get(right));
            int width = right - left;
            int currWater = ht * width;
            maxWater = Math.max(maxWater,currWater);

            if (heights.get(left) < heights.get(right)){
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }
}
