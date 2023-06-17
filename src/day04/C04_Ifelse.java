package day04;

import java.util.Scanner;

public class C04_Ifelse {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi girin");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Suanda emekli olamazsınız. Emekli olmanıza kalan süre " + (65-yas));
        }
    }
}
