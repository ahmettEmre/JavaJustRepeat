package day08;

public class C08_StartsWithEndsWith {
    public static void main(String[] args) {
        String str= "Java mutluluktur";
        System.out.println(str.startsWith("j"));//false
        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith("Java"));//true

        System.out.println(str.endsWith("r"));//true
        System.out.println(str.endsWith("mutluluktur"));//true
    }
}
