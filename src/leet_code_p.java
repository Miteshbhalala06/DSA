import java.util.Arrays;

public class leet_code_p {
    public static void main(String[] args) {
        int mat[][] = {
                {100, 30, 2000},
                {00, 6, 50},
                {7, 9000, 80},
        };
        int r = mat.length;
        int c = mat[0].length;
        int row=0 , col=0 ;
        for (int i = 0; i < r; i++) {
//            int max = Integer.MIN_VALUE;
            int manIndex=0;
            for (int j = 0; j < c; j++) {
                if (mat[i][j] > mat[i][manIndex]) {
                    manIndex = j;

//                    row = i;
//                    col = j;
//                    System.out.println(row);
//                    System.out.println(col);
                }
            }
//            System.out.println(max);

//            for (int m = row; m < r; m++) {
//                for (int n = col; n < c - 1; n++) {
//                    mat[m][n] = mat[m][n + 1];
//
//                }
//            }
                for (int n = manIndex; n < c - 1; n++) {
                    mat[i][n] = mat[i][n + 1];
                }


        }
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c-1;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
//        int grid[][] = {
//                {1,10,4,2},
//                {9,3,8,7},
//                {15,16,17,12},
//        };
//
//        int r = grid.length;
//        int c = grid[0].length;
//        int arr[][]=new int [1][c];
//        for (int i=0;i<r;i++)
//        {
//            int min=Integer.MAX_VALUE;
//            int k=0;
//            for (int j=0;j<c;j++)
//            {
//                if (min>grid[i][j])
//                {
//                    min=grid[i][j];
//                }
//                arr[0][k]=min;
//            }
//                k++;
//        }
//        for (int i=0;i<1;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}



