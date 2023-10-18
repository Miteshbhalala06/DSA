package Array_List;

import java.util.ArrayList;

public class practice_list {

    public static boolean isMonotonic(ArrayList<Integer> arr){
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) < arr.get(i+1)){
                inc = false;
            }

            if (arr.get(i) > arr.get(i+1)){
                dec = false;
            }

        }
        return inc || dec;


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(1);
//        arr.add(3);
//        arr.add(3);
//        arr.add(3);
        // [1,1,1,2,2,3,3,3]

        // optimize from solution
        System.out.println(isMonotonic(arr));




    }






//        boolean sw = false;
//
//        for (int i = 0; i < arr.size()-1; i++) {
//            if (arr.get(i) != arr.get(i+1) && arr.get(i) < arr.get(i+1)){
//
//                // ascending
//                for (int j = i; j < arr.size()-1; j++) {
//                    sw = false;
//                    if (arr.get(j) <= arr.get(j+1)){
//                        sw = true;
//                    }
//                    else {
////                        if (!sw){
//                            break;
////                        }
//                    }
//                }
//                break;
//            }
//
//            else if (arr.get(i) != arr.get(i+1) && arr.get(i) > arr.get(i+1)){
//                for (int j = i; j < arr.size()-1; j++) {
//                    sw = false;
//                    if (arr.get(j) >= arr.get(j+1)){
//                        sw = true;
//                    }else {
//                        if (sw == false){
//                            break;
//                        }
//                    }
//                }
//                break;
//
//            }
//
//        }
//        if (sw == true){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//    }


}
