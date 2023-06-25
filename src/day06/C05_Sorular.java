package day06;

import java.util.Scanner;

public class C05_Sorular {
    public static void main(String[] args) {

        /*
        Kullanicidan bire sayi alin
        sayi 10 dan küçük ise "kucuk sayi"
        sayi 10 yada 10 dan buyuk ise "buyuk sayi" yazirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi<10 ? "kucuk sayi" :  "buyuk sayi");
    }
}
