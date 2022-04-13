package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) throws IllegalArgumentException {
        /*
        kullanicidan yasini al
        kulanici yas olarak negatif 0 veya 120 den buyu sayi girerse
        IllegalArgumentException olusacak sekilde bir program yazin
         */

        Scanner scan = new Scanner(System.in);
        int yas = scan.nextInt();
        if(yas<=0||yas >120){
            //System.out.println("gecerli sayi gir");
            //java bizim istedigmiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();   //cod calissin istiyorsan try catch yap
            // durmmasini istiyorsan throw attr
        }else{
            System.out.println("uygun yas girdin tesekkurler");

        }
    }
}
