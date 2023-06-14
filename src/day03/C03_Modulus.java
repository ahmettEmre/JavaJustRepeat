package day03;

public class C03_Modulus {
    public static void main(String[] args) {

        // % Modulus : java da bolme islemindeki sonuctaki kalan sayiyi gösterir

        System.out.println(15 % 4);//3
        System.out.println(45 % 4);//1

        /* kullanicinin girdigi deger cift sayi mi ?
           girilenSayi % 2 isleminin sonucu 0 ise cift sayidir

           kullanicinin girdigi sayi 7'nin kati mi ?
           girilensayi % 7 isleminin sonucu 0 ise 7'nin katidir

           kullanicinin girdigi sayinin birler basamagi
           kullanici 3426 girdi

         */
        System.out.println(10%2);//0
        System.out.println(14 % 7);//0

        int girilenSayi=3426;
        int birlerBasamagi=girilenSayi%10;
        System.out.println(birlerBasamagi);
    }
}
