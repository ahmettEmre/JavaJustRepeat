package day06;

import java.util.Scanner;

public class C06_Soru2 {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        int not = scan.nextInt();

        System.out.println( not>=50 ? "Sinifi Gectin" : " Maalesef kaldin " );
    }
}
