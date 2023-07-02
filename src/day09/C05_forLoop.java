package day09;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int carpim = 1;

        for (int i = sayi; i >=1 ; i--) {
            carpim=carpim*i;
        }
        System.out.println("Girdiginiz sayinin faktoryeli : " + carpim);
    }
}
