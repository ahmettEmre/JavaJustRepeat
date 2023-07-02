package day09;

import java.util.Scanner;

public class C06_forLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tamsayi giriniz");
        int baslangic=scan.nextInt();
        int bitis = scan.nextInt();

        if (bitis<baslangic) System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        else {
            int toplam=0;
            for (int i = baslangic; i <= bitis; i++) {
                toplam=toplam+i;
            }
            System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami: "+ toplam);
        }
    }
}
