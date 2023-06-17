package day04;

import java.util.Scanner;

public class C05_IfelseSoru {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");
        double not = sc.nextDouble();

        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else {
            System.out.println("Maalesef kaldin");
        }
    }
}
