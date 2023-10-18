public class pattern_8_palindrome_n {
    public static void main(String[] args) {
        palindrome(5);
    }
    public static void palindrome(int n) {
       for (int i=1;i<=n;i++){
           for (int j=n-1;j>=i;j--){
               System.out.print(" ");
           }
           for (int k=i;k>=1;k--){
               System.out.print(k);
           }
           for (int x=2;x<=i;x++){
               System.out.print(x);
           }
           System.out.println();
       }


    }
}
