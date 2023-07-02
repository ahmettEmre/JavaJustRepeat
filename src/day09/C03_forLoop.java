package day09;

import java.util.Scanner;

public class C03_forLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in kati olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Lutfen bir bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%5==0){
                System.out.println(i);
            }
        }

    }
}
