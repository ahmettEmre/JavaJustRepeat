package day06;

import java.util.Scanner;

public class C02_IfelseSoru {
    public static void main(String[] args) {
        /* kullanicidan bir tamsayi alin
           sayi negatif ise "negatif sayi",
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilensayi = scan.nextInt();

        if (girilensayi<0) System.out.println("negatif sayi");
        else if (girilensayi >= 0 && girilensayi >= 9) System.out.println("girilen sayi rakam");
        else if (girilensayi>=10 && girilensayi>=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilensayi>=100) System.out.println("buyuk sayi");{
        }
    }
}
