package day07;

import java.util.Scanner;

public class C02_SwitchSoru {

    public static void main(String[] args) {
        // Kullanicidan gun numarasini alip
        // gun ismini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Gün numarasi girin lütfen");

        int tagnummer= scan.nextInt();

        switch (tagnummer) {

            case 1 : System.out.println("Montag");
                break;
            case 2 : System.out.println("Dienstag");
                break;
            case 3 : System.out.println("Mittwoch");
                break;
            case 4 : System.out.println("Donnerstag");
                break;
            case 5 : System.out.println("Freitag");
                break;
            case 6 : System.out.println("Samstag");
                break;
            case 7 : System.out.println("Sonntag");
                break;

            default: System.out.println(" Ungültige Berechnung ");


        }

    }
}
