package Array_List;

import java.util.ArrayList;

public class swap_num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int inx1 = 1, inx2 = 3;
        System.out.println(arr);
        swap(arr,inx1,inx2);
        System.out.println(arr);

    }

    public static void swap(ArrayList<Integer> arr,int inx1 , int inx2){
        int temp = arr.get(inx1);
        arr.set(inx1 , arr.get(inx2));
        arr.set(inx2 , temp);
    }
}
