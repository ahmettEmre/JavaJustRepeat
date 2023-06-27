package day06;

import java.util.Scanner;

public class C07_Odev {

    //Kullanicidan bir sayti alin
    //sayi 7 ye tam bolunuyorsa "Girmis oldugunuz sayi 7 ye bolunuyor"
    // bolunmuyor ise "Girmis oldugunuz sayi 7 ye bolunmuyor" yazdirin
    //Hem ternary ile hem if-else ile cozun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Zahl");
        int gegebenezahl = scan.nextInt();

        if (gegebenezahl % 7 == 0) System.out.println("Ihre gegebene Zahl ist für teilung geeignet");

        else  {
            System.out.println("Geteilte zahl ist nicht geeignet");

        }

        /*


        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Zahl");
        int gegebenezahl = scan.nextInt();

        gegebenezahl= gegebenezahl%7==0 ? "Ihre gegebene Zahl ist für teilung geeignet" : "Geteilte zahl ist nicht geeignet"

        System.out.println (" Berechnung ist : " + gegebenezahl );

         */
    }
}
