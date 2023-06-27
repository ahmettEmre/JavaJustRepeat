package day07;

public class C01_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi alin
        // ve kullaniciya istedigi islemi sorun
        // +, - , * , / isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        // bu isaretlerden birini girmezse
        // "yanlis islem tercihi" yazdirin

        int sayi1 = 20 ;
        int sayi2 = 10 ;

        char islem = '*' ;

        // if else
        if (islem == '+') System.out.println("Sayilarin toplami : "+ (sayi1+sayi2));
        else if (islem == '-') System.out.println("Sayilarin farki : "+(sayi1-sayi2));
        else if (islem == '*') System.out.println("Sayilarin carpimi : "+ (sayi1*sayi2));
        else if (islem == '/') System.out.println("Sayiların birbirine bolumu : " + (sayi1/sayi2));
        else System.out.println("Yanlis islem tercihi");

        // Switch ile cozelim
        System.out.println("---------------------------");

        switch (islem){
            case '+': System.out.println("Sayilarin toplami : "+ (sayi1+sayi2));
            break;

            case '-': System.out.println("Sayilarin farki : "+(sayi1-sayi2));
            break;

            case '*': System.out.println("Sayilarin carpimi : "+ (sayi1*sayi2));
            break;

            case '/': System.out.println("Sayiların birbirine bolumu : " + (sayi1/sayi2));
            break;

            default: System.out.println("Yanlis islem tercihi");
        }

    }
}
