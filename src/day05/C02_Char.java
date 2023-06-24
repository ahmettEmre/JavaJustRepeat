package day05;

import java.util.Scanner;

public class C02_Char {
    /*
                Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.

         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin harfini girin");
        char harf =scan.next().charAt(0);
        //index yazılımda bir sayı ve ya harfin sanaldaki sıralamasıidr

        if (harf=='o'|| harf=='O'){System.out.println("Ocak");}
        if (harf=='s'|| harf=='S'){System.out.println("Subat");}
        if (harf=='m'|| harf=='M'){System.out.println("Mart veya Mayis");}
        if (harf=='n'|| harf=='N'){System.out.println("Nisan");}
        if (harf=='h'|| harf=='H'){System.out.println("Haziran");}
        if (harf=='t'|| harf=='T'){System.out.println("Temmuz");}
        if (harf=='a'|| harf=='A'){System.out.println("Agustos veya Aralik");}
        if (harf=='e'|| harf=='E'){System.out.println("Eylul veya Ekim");}
        if (harf=='k'|| harf=='K'){System.out.println("Kasim");}
}
}
