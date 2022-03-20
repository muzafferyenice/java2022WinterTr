package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz...");
        char ilkHarf =scan.next().charAt(0); // charAt methodu parametre olarak yazdıgımız indexteki char i bize getirir

        System.out.println("Girdiginiz ismin ilk harfi: " + ilkHarf);

    }
}
