package day06;

import java.util.Scanner;

public class C01_IfelseSoru {
    public static void main(String[] args) {

        /* kullanicidan bir tamsayi alin
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi>=0 && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi>=10 && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("buyuk sayi");
        else System.out.println("Lutfen pozitif bir sayi giriniz");
    }
}
