package day08;

public class C10_FirstTest {
    public static void main(String[] args) {

        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        //1. adim
        String input = "1-48 of 87 results for \"nutella\"";

        int indexOfInput = input.indexOf("of");
        int indexResults = input.indexOf("results");

        String seksenYediString = input.substring(indexOfInput+3,indexResults-1) ;
        int sayi = Integer.parseInt(seksenYediString);

        if (sayi>50){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //2.Yontem
        String str = input.substring(8,10);

        int sayi2 = Integer.parseInt(str);
        if (sayi2>50){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
    }
}
