package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyet yaz"+ "\nKadin icin K \n Erkek icin E harfini gir ");

        char cinsiyet= scan.next().toUpperCase().charAt(0);
        System.out.println("yasini gir");
        double yas= scan.nextDouble();

        if (cinsiyet =='K'){

            if (yas<0 || yas>120){
                System.out.println("girdigin yasi kontrol et");
            }else if (yas<60){
                System.out.println("emekli olamazsin \nDaha " + (60-yas)+ "yil calisman gerek");
            }else {
                System.out.println("emekli olabilirsin" );
            }

        } else if (cinsiyet=='E'){

            if (yas<0 || yas>120){
                System.out.println("girdigin yasi kontrol et");
            }else if (yas<65){
                System.out.println("emekli olamazsin \nDaha " + (65-yas)+ "yil calisman gerek");
            }else {
                System.out.println("emekli olabilirsin" );
            }

        }else {
            System.out.println("cinsiyet icin gecerli bir harf girin");
        }

    }
}
