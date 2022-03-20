package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi  giriniz:");

        String isim = scan.nextLine();
        System.out.println(" soyisminizi giriniz ");
        String soyisim= scan.nextLine();

        System.out.println("Isim- soyisim :"  + isim + " " + soyisim);

    }
}
