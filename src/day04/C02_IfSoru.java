package day04;

import java.util.Scanner;

public class C02_IfSoru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi=scan.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }else {
            System.out.println("Uc ile bolunebilen sayi degildir");
        }




        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }else {
            System.out.println("Bes ile bolunebilen sayi degildir");
        }




    }
}
