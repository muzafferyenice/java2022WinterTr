package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli nir tam sayi giriniz");
        int sayi= scan.nextInt();
        int rakam =0;

        int rakamlarToplami=0;                              //7532

                           //753

        rakam=sayi%10;                                  //3
        rakamlarToplami +=rakam;                        //5
        sayi/=10;                                       // 75

        rakam=sayi%10;                                  //5
        rakamlarToplami +=rakam;                        //10
        sayi/=10;                                       //7

        rakam=sayi%10;                                  //7
        rakamlarToplami +=rakam;                        //17
        sayi/=10;                                        //0

                // rakamlarToplami +=rakam;  rakamlar toplamina rakami ekle assing et demek


        System.out.println("girdiginiz rakamlar toplami" + "   "+ rakamlarToplami);





    }
}
