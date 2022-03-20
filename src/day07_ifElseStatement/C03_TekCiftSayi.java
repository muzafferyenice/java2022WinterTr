package day07_ifElseStatement;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //kullanicidan tam sayi iste cift oldugunu yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz" );
        int sayi= scan.nextInt();

        if (sayi%2 == 0); {
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi%2 !=0){
            System.out.println("Girilen sayi tek sayi");
        }

        //================ if else ile cozumu========
        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        }else {
            System.out.println("girdiginiz sayi tek sayidir");
        }

    }
}
