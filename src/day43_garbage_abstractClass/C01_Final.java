package day43_garbage_abstractClass;

public class C01_Final {
    final static double piSayisi = 3.14;
    final static String okulIsmi = "Yildiz kolaj";

    public static void main(String[] args) {

        //okulIsmi="java"; ulasirsin ama final old icin degistirilemez
        final int sayi = 10;//hic degismesin istersen final yap
        // sayi=20;

    }

    public static final void method1() {
        System.out.println("Parent class final method1");
        {

        }
    }
}
