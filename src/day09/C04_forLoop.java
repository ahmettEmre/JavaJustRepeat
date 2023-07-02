package day09;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda cift olan sayilari yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println(" Bitte tragen Sie anfangsnummer und endesnummer ein ");

        int anfangsnummer = scan.nextInt();

        int endesnummer = scan.nextInt();

        for (int i = anfangsnummer; i <= endesnummer ; i++) {
            if ( i%2 == 0 )
                System.out.println( " Die sind für diese Rheinfolge geeignet " + i );


        }

    }
}
