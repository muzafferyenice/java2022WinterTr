package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lıtfen gun ismini yaziniz");
        String gunismi = scan.nextLine().toLowerCase();

        if(gunismi.equals("pazar") || gunismi.equals("cumartesi")){
            System.out.println("Girdiginiz gun hafta sonu");
        }

        if (gunismi.equals("pazartesi")|| gunismi.equals("sali") || gunismi.equals("carsamba")||
            gunismi.equals("persembe")|| gunismi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");



        }

    }

}
