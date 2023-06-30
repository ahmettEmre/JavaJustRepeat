package day07;

import java.util.Scanner;

public class C05_SwitchOdev {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println(" Bitte tragen Sie ein Jahreszeitnummer ein. ");

        int tagnummer = scan.nextInt();

        switch (tagnummer){

            case 1:
                System.out.println("Januar");
                break;
            case 2 :
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12:
                System.out.println("Dezember");
                break;
            default:
                System.out.println("Ungültige Eintragung");
        }
    }
    }

