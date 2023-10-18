import java.util.HashSet;

public class subset_another_arr {
    public static void main(String[] args) {

//        Find whether an array is subset of another array

        int [] arr1 = {1,2,3,4,5,6,5,4,6};
        int [] arr2 = {1,2,3};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }
        System.out.println(hashSet);

        for (int i = 0; i < arr2.length; i++) {
            if (!hashSet.contains(arr2[i])){
                System.out.println("Not Subset");
                return;
            }
        }
        System.out.println("Subset");





    }
}
