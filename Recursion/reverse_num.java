public class reverse_num {
    static int rev = 0;
    public static void main(String[] args) {
        int n = 12345;
        reverse(n);
        System.out.println(rev);
    }
    private static void reverse(int n){
        if (n == 0){
            return;
        }
        int d = n % 10;
        n = n / 10;
        rev = (rev * 10) + d;
        reverse(n);

    }
}
