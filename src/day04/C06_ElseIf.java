package day04;

import java.util.Scanner;

public class C06_ElseIf {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu isteyin , 85 ve üzeri 5, 70 ve üzeri 4, 60 ve üzeri 3 , 50 ve üzeri 2, geriye kalanlar 1 alsin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu girin");
        double not= scan.nextDouble();

        if (not>=85){
            System.out.println("5");
        } else if (not >=70) {
            System.out.println("4");
        }else if (not>=60){
            System.out.println("3");
        } else if (not>=50) {
            System.out.println("2");
        }else {
            System.out.println("1");
        }

    }
}
