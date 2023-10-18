public class matrix {
    public static void main(String[] args) {


//        1. Print a matrix ---------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        for (int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }


//        2. Find element from matrix ---------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        int fine=5;
//        boolean flag=false;
//        for (int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                if (mat[i][j]==5)
//                {
//                    flag=true ;
//                }
//            }
//        }
//        if (flag==true){
//            System.out.println("yes it's present");
//        }else
//            System.out.println("not present");

//        3. Sum of element of matrix ---------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        int sum=0;
//        for (int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++){
//                sum+=mat[i][j];
//            }
//        }
//        System.out.println(sum);

//        4. Find row and column size from given matrix ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//
//        System.out.println("row:-" + r + " col:-" + c);

//        5. Print matrix in reverse order ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//
//        for (int i=r-1;i>=0;i--)
//        {
//            for (int j=c-1;j>=0;j--)
//            {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//        6. Row / column wise traversal ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//
//        };
//        int r = mat.length;
//        int c = mat[0].length;

//        for(int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                System.out.print(mat[i][j]+ " ");
//            }
//            System.out.println();
//        }
//
//        for (int j=0;j<c;j++)
//        {
//            for (int i=0;i<r;i++)
//            {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }


//        7. Print matrix in zig zag fashion ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//
//        };
//        int r = mat.length;
//        int c = mat[0].length;

////        for (int i=0;i<r;i++)
////        {
////            if(i % 2==0)
////            {
////                for (int j=0;j<c;j++){
////                    System.out.print(mat[i][j]+" ");
////                }
////            }else {
////                for (int j=c-1;j>=0;j--)
////                {
////                    System.out.print(mat[i][j]+ " ");
////                }
////            }
////            System.out.println();
////        }
//
//        for (int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                if(i % 2==0)
//                {
//                    System.out.print(mat[i][j]+" ");
//                }else {
//                    System.out.print(mat[i][c-1-j]+" ");
//
//                }
//            }
//            System.out.println();
//        }

//        8. Print mirror image of matrix ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//
//        for (int i=0;i<r;i++)
//        {
//            for (int j=c-1;j>=0;j--)
//            {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//        9. Find highest sum among all rows ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<r;i++)
//        {
//            int sum=0;
//            for (int j=0;j<c;j++)
//            {
//                sum+=mat[i][j];
////                if (sum>max)
////                    max=sum;
//            }
//            if (sum>max)
//                max=sum;
//        }
//        System.out.println(max);

//        10. Find highest sum among all columns ---------------------------------------------------------

//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12},
//
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        int max=Integer.MIN_VALUE;
//
//        for (int j=0;j<c;j++)
//        {
//            int sum=0;
//            for (int i=0;i<r;i++)
//            {
//                sum+=mat[i][j];
//                if (max<sum)
//                    max=sum;
//            }
//        }
//        System.out.println(max);


//            11.Delete max element from each row ---------------------------------------------------------

//        int mat[][] = {
//                {10, 3000, 2000},
//                {200, 6, 50},
//                {7, 900, 8000},
//        };
//        int r = mat.length;
//        int c = mat[0].length;
//        int row = 0;
//
//        for (int i = 0; i < r; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = 0; j < c; j++) {
//                if (mat[i][j] > max){
//                    max = mat[i][j];
//                    row = j;
//                }
//            }
//            for (int k = row; k < c-1; k++) {
//                mat[i][k] = mat[i][k+1];
//            }
//        }
//        c--;
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println();
//        }

    //---------------row delete-----------
//        int row=0 , col=0 ;
//        for (int j = 0; j < c; j++) {
////            int max = Integer.MIN_VALUE;
//            int manIndex=0;
//              for (int i = 0; i < r; i++) {
//                if (mat[i][j] > mat[manIndex][j]) {
//                    manIndex = i;
//
////                    row = i;
////                    col = j;
////                    System.out.println(row);
////                    System.out.println(col);
//                }
//            }
////            System.out.println(manIndex);
//
////            for (int m = row; m < r; m++) {
////                for (int n = col; n < c - 1; n++) {
////                    mat[m][n] = mat[m][n + 1];
////
////                }
////            }
//            for (int n = manIndex; n < r-1; n++) {
//                mat[n][j] = mat[n+1][j];
//            }
//
//
//        }
//        r--;
//        for (int i=0;i<r;i++)
//        {
//            for (int j=0;j<c;j++)
//            {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }


//        12.Find element from sorted matrix : Binary search: solution log(row) + log(column) -------------------------------

//        int [][] mat={
//            {1,3,5,7},
//            {9,11,15,18},
//            {23,26,27,29},
//            {34,44,67,88}
////                {5,10,15,20},
////                {4,9,14,19},
////                {3,8,13,18},
////                {2,7,12,17}
//        };
//
//        int r = mat.length;
//        int c = mat[0].length;
//        int val=5;
//        int top=0,bottom=r-1;
//        int rowTobesearches=-1;
//
//        while (top<=bottom){
//            int mid=(top+bottom)/2;
//            if (mat[mid][0]<=val && mat[mid][c-1]>=val){
//                rowTobesearches=mid;
//                break;
//            } else if (mat[mid][0]<val) {
//                top=mid+1;
//            }else {
//                bottom=mid-1;
//            }
//        }
//        System.out.println(rowTobesearches);
//        if (rowTobesearches==-1){
//            System.out.println("value not present");
//        }
//        int left=0,right=c-1;
//        while (left<=right)
//        {
//            int mid=(left+right)/2;
//            if (mat[rowTobesearches][mid]==val)
//            {
//                System.out.println("value is present");
//                return;
//            } else if (mat[rowTobesearches][mid] < val) {
//                left=mid+1;
//            }
//            else {
//                right=mid-1;
//            }
//
//        }


//       13. Search in a row wise and column wise sorted matrix -------------------------------------------

//        int [][] mat={
//                {1,3,5,7},
//                {2,6,9,10},
//                {3,17,19,25},
//                {4,48,20,88}
//        };
//
//        int row = mat.length;
//        int col = mat[0].length;
//        int val=19;
//
//        int r=0,c=col-1;
//        while (c>=0 && r<row-1){
//            if (val==mat[r][c])
//            {
//                System.out.println("value is present");
//                return;
//            } else if (val < mat[r][c]) {
//                c--;
//            }else {
//                r++;
//            }
//        }
//        System.out.println("value is not present");

//        14.Shortest path to reach from [0,0] to [n,n]

        int [][] mat={
                {1,3,5,9},
                {0,8,2,4},
                {9,10,1,3},
        };

        int row = mat.length;
        int col = mat[0].length;
//
        for (int r=0;r<row;r++)
        {
            for (int c=0;c<col;c++)
            {
                if (r==0 && c==0){
                    continue;
                } else if (r==0) {
                    mat[r][c]=mat[r][c]+mat[r][c-1];
                } else if (c==0) {
                    mat[r][c]=mat[r][c]+mat[r-1][c];
                }
                else {
                    mat[r][c]=mat[r][c]+(min(mat[r-1][c],mat[r][c-1]));
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }
    public static int min(int a,int b){
        if (a<b){
            return a;
        }
        return b;
    }


}









