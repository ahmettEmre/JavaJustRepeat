package day02;

public class C01_stringIslem {
    public static void main(String[] args) {

        String str= "Orhan candir";
        int sayi= 10;

        //primitive data turlenrinn hazir methodalri yoktur
        //ancak nonprimitv data turlerinin onceden hazırlanmis methodlari vardir

        System.out.println(sayi); //10

        System.out.println(str.toLowerCase());//orhan candir

        System.out.println(str);

        System.out.println(str.toUpperCase());//ORHAN CANDIR

        System.out.println(str.contains("Orhan"));//true
        System.out.println(str.contains("orhan"));//false

        System.out.println(str.isEmpty());//false

    }

}
