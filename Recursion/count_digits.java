public class count_digits {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        System.out.println(count(n));


    }
    private static int count(int n){
        if (n == 0){
            return 0;
        }
        n = n / 10;
        return 1 + count(n);
    }

}
