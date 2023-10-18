import java.util.HashMap;
import java.util.Map;

public class Most_frequent {
    public static void main(String[] args) {
        
//        Most frequent element in an array
        
        int arr[] = {1,2,3,2,4,2,5,2,3,3,6,4,2};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);

            }else {
                hashMap.put(arr[i],1);
            }
        }

        int max = Integer.MIN_VALUE,ans = -1;
        for (Map.Entry me : hashMap.entrySet()){
            if (max < (int) me.getValue()){
                max = (int) me.getValue();
                ans = (int) me.getKey();
            }
        }
        System.out.println(ans);
    }


}
