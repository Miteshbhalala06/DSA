import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class all_duplicate_Unique {
    public static void main(String[] args) {

//        Print all the duplicate numbers in array

        int arr[] = {1,2,3,4,5,2,4,3,2};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }

        // for dublicate if (1 > )

        for (Map.Entry me: hashMap.entrySet()){
            if ((int)me.getValue() == 1){
                System.out.print(me.getKey() + " ");
            }
        }



    }
}
