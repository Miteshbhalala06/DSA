public class metrix_all {
    public static void main(String[] args) {
        int metrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int mat[][] = {
//                {10,20,30,40},
//                {15,25,35,45},
//                {27,29,37,48},
//                {32,33,39,50}
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        spiralmetrix(metrix);
        stairCase(mat,33);
        binarySearch(mat,11);

    }
    public static void spiralmetrix(int metrix[][]){

        int startRow = 0;
        int endRow = metrix.length-1;
        int startCol = 0;
        int endCol = metrix[0].length-1;

        while (startRow <= endRow  && startCol <= endCol){

            //  top
            for (int j=startCol;j <= endCol;j++){
                System.out.print(metrix[startRow][j]+" ");
            }

            // Right
            for (int i=startRow+1; i <= endRow;i++){
                System.out.print(metrix[i][endCol]+" ");
            }

            // Bottom
            for (int j=endCol-1;j >= startCol;j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(metrix[endRow][j]+" ");
            }

            // Left
            for (int i=endRow-1;i >= startRow+1;i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(metrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

    public static void stairCase(int mat[][],int key){
        // search element in rowwise and colwise sort in matrix

        int r= mat.length-1;
        int c= 0;

        while (r >= 0  && c <= mat[0].length-1){
            if (mat[r][c] == key){
                System.out.println("present");
                return;
            } else if (key < mat[r][c]) {
                r--;
            }else {
                c++;
            }
        }
        System.out.println("not present");

    }

    public static void binarySearch(int mat[][] ,int val){

        // this is use for only row - wise sort in matrix not both

        int top=0;
        int bottom = mat.length-1;
        int rowTObeSearches = -1;

        while (top <= bottom){
            int mid = (top + bottom) / 2;
            if (mat[mid][0] <= val && val <= mat[mid][mat[0].length-1]){
                 rowTObeSearches = mid;
                break;
            }
            else if (mat[mid][0] < val){
                top = mid +1;
            }
            else {
                bottom = mid - 1;
            }
        }

        if (rowTObeSearches == -1){
            System.out.println("value is not found");
        }

        int left = 0;
        int right = mat[0].length-1;

        while (left <= right){
            int mid= (left + right) / 2;

            if (mat[rowTObeSearches][mid] == val){
                System.out.println("value is present");
                return;
            } else if (mat[rowTObeSearches][mid] < val) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
    }

}
