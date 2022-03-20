package day07_ifElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini gir");
        int yas= scan.nextInt();

        if (yas >= 65) {
            System.out.println("emeklisin");
        }else{
            System.out.println("olamassın");
            System.out.println(65-yas + " sene daha calis");
        }

        //if else satement larda iki durumdan sadece biri calisir
    }
}
