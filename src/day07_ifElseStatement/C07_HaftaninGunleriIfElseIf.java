package day07_ifElseStatement;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazinir");
        String gunismi=scan.nextLine().toLowerCase();


        if(gunismi.equals("pazar") || gunismi.equals("cumartesi")) {
            System.out.println("gun hafta sonu");

        }else if (gunismi.equals("pazartesi")|| gunismi.equals("sali") || gunismi.equals("carsamba")||
                gunismi.equals("persembe")|| gunismi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");

        }else{
                System.out.println("gecerli gun gir");
        }
                    // bu statement else ile bitiyorsa olasiliklardan bir tanesi calisir
    }
}
