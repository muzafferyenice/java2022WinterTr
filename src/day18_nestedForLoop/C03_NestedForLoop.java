package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //      *
        //      * *
        //      * * *
        //      * * * *

        int sayi = 5;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {  // for (int j = 1; j <=i ; j++) yazarsan if e gerek kalmaz
                if (i > j) {
                    System.out.print(" * ");
                }

            }

            System.out.println(" * ");
        }

        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {  // for (int j = 1; j <=i ; j++) yazarsan if e gerek kalmaz
                if (i < j) {
                    System.out.print(" * ");
                }

            }

            System.out.println(" * ");
        }


        }
    }
