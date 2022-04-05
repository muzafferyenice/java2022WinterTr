package day34_accessModifier_Encapsulation;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static int aciksayi=20;
    String acikString = "Hi";
    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;
   protected C01(){
        // bu constructor'in access modifier'i
        // default access modifier'dir
        // dolayisiyla icinde oldugumuz paketin disinda
        // bu class'dan obje olusturulamaz
    }
    private C01(int no ){
        System.out.println("parametreli constructor calisti");
    }
    private void method1(){

    }


}
