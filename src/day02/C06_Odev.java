package day02;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {
        /*
         Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir dikdortgen icin 2 kenar uzunkugu belirtin");
        double kenar1=scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Dikdortgenin alanı: "+ kenar1*kenar2);

        /*

    Kullanicidan iki sayi alip
    ikisinin degerlerini degistirin(swap).

        kullanicinin girdigi degerler
        sayi1= 10  sayi2=20 ise

        siz kod ile bunlarin degerlerini degistirip
        sayi1=20  sayi2=10 yapin
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi girin");
        int kirmiziKova=scanner.nextInt();
        int sariKova=scanner.nextInt();

        int bosKova;

        bosKova=kirmiziKova;
        kirmiziKova=sariKova;
        sariKova=bosKova;
        System.out.println("Kırmızı Kovanın yeni degeri: "+kirmiziKova
        +"\nSari kovanın yeni degeri : "+ sariKova);

    }
}
