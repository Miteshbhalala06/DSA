class matrix_p_all {
    public static void main(String[] args) {
       int mat[][] = {
               {4,7,8},
               {8,8,7}
       };
       int count = p1(mat);
        System.out.println(count);

        int nums[][] = {
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };

        int sum = p2(nums);
        System.out.println(sum);

    }

    public static int p1 (int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        int count =0;
        for (int i=0;i<r ;i++){
            for (int j=0;j<c;j++){
                if (mat[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static int p2(int nums[][]){
        int r = nums.length;
        int c = nums[0].length;
        int sum =0;

//        for (int i=0;i<r ;i++){
//            for (int j=0;j<c;j++){
//                if (i == 1){
//                    sum+= nums[i][j];
//                }
//            }
//        }
        //   optimize -----------------------------------------------------------------------

        for (int i=0;i<c;i++){
            sum+= nums[1][i];
        }
        return sum;
    }

}