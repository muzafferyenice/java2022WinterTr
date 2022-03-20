package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        //String kullaniciIsmi= scan.next();               // bu method sadce ilşk kelimeyi alır ilk space a kadar

        String kullaniciIsmi = scan.nextLine();            // tüm line i alır bu method
        System.out.println("kullanicinin girdigi isim : " + kullaniciIsmi);




    }
}
