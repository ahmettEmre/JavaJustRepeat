package day06;

public class C04_Ternary {
    public static void main(String[] args) {
        // Kullanicidan alinan deger
        // 100'den buyukse sayiyi 2 ile carpin
        // 100'e esit veya kucuk ise sayiya 10 ekleyin

        int sayi= 105;

        //if else

        if (sayi>100){
            System.out.println(sayi*2);
        }else{
            System.out.println(sayi+10);
        }

        //ternary

        sayi=sayi>100 ? sayi*2 : sayi+10;
        System.out.println("Ternary ile degeri : "+ sayi);

        /*
          Verilen input'u inceleyin
          eger 100'den buyukse bunu 5'e bolup, bolum sonucunun tek sayi olup olmadigini kontrol edin
          eger 100'den buyuk degilse , 10 ile bolumunden kalani bulup, bu kalani 5 artirin


          Bu tur kompleks islemleri TERNARY ILE YAPMAYIZ
         */
    }
}
