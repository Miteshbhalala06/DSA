package Oops;

import java.util.Scanner;

public class question_pra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        c1.a = sc.nextInt();
        c1.b = sc.nextInt();
        System.out.println(c1.sum(c1.a, c1.b));

    }
}

class Complex{
    int a ;
    int b;

    int sum (int a,int b){
        return a + b;
    }
}
