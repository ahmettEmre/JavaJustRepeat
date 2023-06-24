package day05;

import java.util.Scanner;

public class C01_IfSoru {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //          ucgen eskenar ise “Eskenar ucgen” yazdirin ve ucgenin alanini yazdirin

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lütfen bir ücgen icin 3 kenar uzunlugu giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();

        if ( sayi1==sayi2 && sayi2==sayi3){
            System.out.println("girmis oldugunuz degerlere göre ücgen eskanar ücgendir ");
            System.out.println("Ücgenin alani su sekildedir " + (sayi1*sayi2*sayi3) );

        }
        else {
            System.out.println("eskenar degildir");
        }
    }
}
