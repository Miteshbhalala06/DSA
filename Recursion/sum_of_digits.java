public class sum_of_digits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
    private static int sum(int n){
        if (n == 0){
            return 0;
        }
        int rem = n % 10;
        n = n / 10;
        return rem + sum(n);
    }
}
