package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin
        ve sayinin karesini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bize bir sayi giriniz");
        int sayi= scan.nextInt();
        double kare = sayi*sayi;
        System.out.println(kare);

    }
}
