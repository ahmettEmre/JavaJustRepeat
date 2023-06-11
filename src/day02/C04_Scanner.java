package day02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.

		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi girin");
        String isim=scan.nextLine();

        System.out.println("Soyisminizi girin");
        String soyisim= scan.nextLine();

        System.out.println("Yasinizi girin");
        int yas = scan.nextInt();

        System.out.println("Isminiz: "+ isim +
                "\nSoyisim: " + soyisim +
                "\nYasiniz: "+ yas +
                "\nKaydiniz basariyla tamamlanmistir.");
    }
}
