package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("gun ismi gir");
        String gunismi= scan.nextLine().toUpperCase();

        if (gunismi.equals("PAZAR")|| gunismi.equals("CUMARTESİ")){ //gnleri kucuk harf yazarsan body calismaz
            System.out.println("girdiginiz gun hafta sonu");
        }else {
            System.out.println("girdiginiz gun hafta ici");
        }
    }
}
