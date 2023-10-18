package Array_List;

import java.util.ArrayList;
import java.util.List;

public class Arrat_L_operation {
    public static void main(String[] args) {

        // Java Collection framework
        // ClassName ObjectName = new ClassName
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr_2 = new ArrayList<>();

        // o(1)
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

//        arr.add(2,30);

        System.out.println(arr);

        // Get opearion o(1)
//        int element = arr.get(2);
//        System.out.println(element);

//         Delete element  --- o(n)
//        arr.remove(2);
//        System.out.println(arr);

        // set element o(n)
//        arr.set(2,30);
//        System.out.println(arr);

        // Contains -- o(n)
//        System.out.println(arr.contains(3));
//        System.out.println(arr.contains(30000));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");

        }
    }
}
