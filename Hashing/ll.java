import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ll {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int k = 1;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : arr){
            int num1 = i + k;
            int num2 = i - k;

            if (hm.containsKey(num1)){
                count += hm.get(num1);
            }
            if (hm.containsKey(num2)){
                count += hm.get(num2);

            }
            if (hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else {
                hm.put(i,1);
            }


        }
        System.out.println(count);

        
    }

}
