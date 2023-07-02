package day09;

public class C02_forLoop {
    public static void main(String[] args) {
        // 1 ile 100 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin

        int sayilarinToplami=0;

        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
            sayilarinToplami=sayilarinToplami+i;
        }
        System.out.println("Sayilarin toplami:"+ sayilarinToplami);
    }
}
