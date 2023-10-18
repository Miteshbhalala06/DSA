public class p_palimdrome {
    public static void main(String[] args) {
        int n=12345;
        int reverse=0;

            while (n > 0) // n!=0
            {
                int d = n % 10; //5
                reverse=(reverse * 10) + d;
                n = n / 10;
            }

        System.out.println(reverse);

    }
}
