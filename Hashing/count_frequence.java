import java.util.HashMap;

public class count_frequence {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5,4,3,2,1,6,7};

        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])){
                int oldCount = hashmap.get(arr[i]);
                System.out.println(oldCount);
                hashmap.put(arr[i],oldCount+1);
            }else {
                hashmap.put(arr[i],1);
            }

        }
        System.out.println(hashmap);
    }
}
