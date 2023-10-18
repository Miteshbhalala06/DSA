public class check_prime_num {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n,2));
    }
    private static boolean isPrime(int n,int i){
        if (i == n/2+1){
            return true;
        }

        if (n % i == 0){
            return false;
        }
        i++;
        return isPrime(n,i);

    }
}
