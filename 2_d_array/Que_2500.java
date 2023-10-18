import java.util.Arrays;

public class Que_2500 {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum+=mat[i][i];
            if (i != c-1-i)
            sum+=mat[i][c-1-i];
        }

        System.out.println(sum);

    }


}
