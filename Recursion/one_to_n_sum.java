public class one_to_n_sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
        print(5);
    }
    private static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    // ---------print 1 to n numbers --------------
    private static void print(int n){
        if (n == 1){
            System.out.print(1+" ");
            return;
        }
//        System.out.print(n+" ");              for reverse print-------------------------
        print(n-1);
        System.out.print(n+" ");
    }
}
