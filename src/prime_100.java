public class prime_100 {
    public static void main(String[] args) {
        //  1 and 0 are not prime numbers
        for(int num=2;num<=100;num++)
        {
            int t=0;

            for(int i=2;i<=num-1;i++)
            {
                if(num % i == 0)
                {
                    t++;
                }

            }
            if(t == 0) {
                System.out.print(num + " ");
            }

        }

    }
}
