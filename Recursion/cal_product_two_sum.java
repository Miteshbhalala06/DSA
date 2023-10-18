public class cal_product_two_sum {
    public static void main(String[] args) {
        int m = -5;
        int n = 2;
        System.out.println(product(m,n));
    }
    private static int product(int m,int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if (m < 0 && n < 0){
            return product((-1 * m),(-1 * n));
        } else if (m > 0 && n < 0) {
            return product(n,m);
        }

        // -----------------Base Condtion-----------------------------------5
        if (n == 0){
            return 0;
        }
        return m + product(m,n-1);
    }
}
