package day05;

import java.util.Scanner;

public class C03_IfSoru {
    public static void main(String[] args) {
        //  Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikizkenar ise “Ikizkenar ucgen” yazdirin, degilse “Ikizkenar degil” yazdirin.
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen ikizkenar ölcümü icin 3 deger giriniz");
            int sayi1 = scan.nextInt();
            int sayi2 = scan.nextInt();
            int sayi3 = scan.nextInt();

            if (sayi1 == sayi2 || sayi2 == sayi3 || sayi1 == sayi3) {
                System.out.println("Girmis oldugunuz degerler Ikizkenar ücgen degerleridir");

            } else {
                System.out.println("Ücgeniniz ikizkenar degildir");
            }
    }
}
