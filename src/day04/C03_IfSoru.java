package day04;

import java.util.Scanner;

public class C03_IfSoru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin.

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Uc kenar verin");
        int sayi= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi3= sc.nextInt();

        if (sayi==sayi2 && sayi2 == sayi3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
    }
}
