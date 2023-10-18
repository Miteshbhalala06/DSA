import java.util.Arrays;

public class revision {
    public static void main(String[] args) {

//            11.Delete max element from each row ---------------------------------------------------------

       int[][] grid = {{1,2,4},{3,3,1}};

        int r=grid.length;
        int c=grid[0].length;
        int sum=0;

        for(int i=0;i<r;i++)
        {
            Arrays.sort(grid[i]);
        }

        for (int j=0;j<c;j++){
            int max=Integer.MIN_VALUE;
            for (int i=0;i<r;i++){
                if (max<grid[i][j]){
                    max=grid[i][j];
                }
            }
            sum+=max;
        }
        System.out.println(sum);
    }
}
