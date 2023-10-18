import java.util.Arrays;
import java.util.Comparator;

public class lucky_num {
    public static void main(String[] args) {
//        int mat[][]={
//                {1,10,4,2},
//                {9,3,8,7},
//                {15,16,17,12},
//        };
//        int r=mat.length;
//        int c=mat[0].length;

//        int col=0;
//        for (int i=0;i<1;i++){
//            int min=Integer.MAX_VALUE;
//            for (int j=0;j<c;j++){
//                if (min>mat[i][j])
//                {
//                    min=mat[i][j];
//                     col=j;
//                }
//            }
//            for (int x=col;x<col+1;x++)
//            {
//                int max= Integer.MIN_VALUE;
//                for (int y=0;y<r;y++){
//                    if (mat[y][col]>=mat[y][x]){
//                        System.out.println(mat[col][y]);
//                    }
//
//                }
//
//            }
//
//        }
        int mat[][]={
                {1,2,4},
                {3,3,1},
                {4,6,5}
        };
        int r=mat.length;
        int c=mat[0].length;
        int sum=0;


        for(int i=0;i<r;i++)
        {
            Arrays.sort(mat[i]);
        }

        for (int j=0;j<c;j++){
            int max=Integer.MIN_VALUE;
            for (int i=0;i<r;i++){
               if (max<mat[i][j]){
                   max=mat[i][j];
               }
            }
            sum+=max;
        }
        System.out.println(sum);



    }
}
