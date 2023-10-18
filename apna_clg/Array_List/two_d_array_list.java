package Array_List;

import java.util.ArrayList;

public class two_d_array_list {
    public static void main(String[] args) {

        //-----------------------EX - 1 -------------------------------------------------
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//
//        ArrayList<Integer> List = new ArrayList<>();
//        List.add(1);
//        List.add(2);
//        mainList.add(List);
//        List.add(2);
//        List.add(2);
//
//        ArrayList<Integer> List2 = new ArrayList<>();
//        List2.add(3);
//        List2.add(4);
//        mainList.add(List2);
//
//        for (int i = 0; i < mainList.size(); i++) {
//            ArrayList<Integer> currList = mainList.get(i);
//            for (int j = 0; j < currList.size(); j++) {
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(mainList);

        //-----------------------EX - 2 -------------------------------------------------

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();   // 1 2 3 4 5
        ArrayList<Integer> list2 = new ArrayList<>();   //  2 4 6 8 10
        ArrayList<Integer> list3 = new ArrayList<>();   // 3 6 9 12 15

        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        list2.remove(2);
        list2.remove(3);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        // Nested Looop

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }


    }
}
