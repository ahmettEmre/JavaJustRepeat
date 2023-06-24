package day04;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyetinizi ve yasinizi girin");
        String cinsiyet=scan.next();
        int yas = scan.nextInt();


        if (cinsiyet.contains("erkek")){
            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("Emekli olmaniza daha "+ (65-yas) + " yil var");
            }
        }
        else {
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz");
            }
        else {
                System.out.println("Emekli olmaniza daha "+ (60-yas) + " yil var");
            }
        }

    }
}
