import java.util.HashMap;
import java.util.Map;

public class check_two_arr_same {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,5,6,3};
        int arr2[] = {6,5,3,4,5,2,5};

//        Check if two arrays are equal or not


        HashMap<Integer,Integer> hashMap1= new HashMap<>();
        HashMap<Integer,Integer> hashMap2 = new HashMap<>();

        if (arr1.length != arr2.length){
            System.out.println("Not same");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (hashMap1.containsKey(arr1[i])){
                hashMap1.put(arr1[i],hashMap1.get(arr1[i])+1);
            }else {
                hashMap1.put(arr1[i],1);
            }

            if (hashMap2.containsKey(arr2[i])){
                hashMap2.put(arr2[i],hashMap2.get(arr2[i])+1);
            }else {
                hashMap2.put(arr2[i],1);
            }
        }


        for(Map.Entry me : hashMap1.entrySet()){
//            int v1 = (int)me.getValue();
//            int v2 = hashMap2.get(me.getKey());
//
//            if (v1 != v2){
//                System.out.println("Not Same");
//                return;
//            }
            if (me.getValue() != hashMap2.get(me.getKey())){
                System.out.println("Not same");
                return;
            }
        }
        System.out.println("Same");
    }
}
