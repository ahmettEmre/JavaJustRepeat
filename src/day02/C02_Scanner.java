package day02;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
        kullannicidan ismini alin
        ve girilen ismi buyuk harflerle yazdirin
         */

        // 1.adim scanner objesi olusturmak
        Scanner scan=new Scanner(System.in);

        // 2. adim kullaniciya ne istedigimizi soylemek
        System.out.println("isminizi girin");

        //3. adim kullanicin girecegi degeri kaydedecegimiz bir veriable olusturalim
        //scan objesi ile girilen degeri atayalim
        String isim = scan.nextLine();
        //System.out.println(isim);

        System.out.println(isim.toUpperCase());
    }
}
