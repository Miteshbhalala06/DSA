import java.util.HashMap;

public class check_pair_sum {
    public static void main(String[] args) {

//        Check if pair with given Sum exists in Array

        int[] arr = {1,2,3,4,5,6};
        int sum = 12;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * 2 == sum){
                if (hashMap.get(arr[i]) >= 2){
                    System.out.println("Pair is Present");
                    return;
                }
            }else {
                int rem = sum - arr[i];
                if (hashMap.containsKey(rem)){
                    System.out.println("pair is present");
                    return;
                }
            }

        }
        System.out.println("pair not present");

    }
}
