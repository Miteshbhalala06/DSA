public class array_p_1 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        checkElement(nums);

    }

    public static void checkElement(int nums[]){

        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
//                    return true;
                    System.out.println("t");
                    return;
                }

            }
        }
//        return false;
        System.out.println("n");
    }
}
