package day07;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {
        // Kullanicidan gun numarasini alin
        // hafta ici veya hafta sonu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun numarası giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta Ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");

        }
    }
}
