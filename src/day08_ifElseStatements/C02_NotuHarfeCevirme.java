package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("not gir");
        double notSayi= scan.nextDouble();

      /*
        if (notSayi<50){
            System.out.println("notunuz D");
        }else if (notSayi>=50 && notSayi<60){
            System.out.println("not C");

        }else if (notSayi>=60 && notSayi<80){
            System.out.println("not B");
        }else {
            System.out.println("not A");
        }
        */
        if (notSayi<50){
            System.out.println("notunuz D");
        }else if (notSayi<60){
            System.out.println("not C");

        }else if (notSayi<80){
            System.out.println("not B");
        }else {
            System.out.println("not A");
        }

    }

}
