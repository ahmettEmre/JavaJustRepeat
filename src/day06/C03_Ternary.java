package day06;

public class C03_Ternary {
    public static void main(String[] args) {

        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        int sayi=23;

        //if else ile yapalim
        if (sayi%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        //ternary ile yapalim

        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");
    }
}
