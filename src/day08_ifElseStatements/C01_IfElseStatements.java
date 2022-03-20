package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z') ){
            System.out.println("girdiginiz karakter bir harf");
        }else {
            System.out.println("girdiginiz karakter bir harf degil");



        }
    }
}
