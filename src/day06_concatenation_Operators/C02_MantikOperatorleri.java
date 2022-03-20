package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;// cift and bir yerde durur

        System.out.println(sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 && 5+2!=8;// tek and sonuna kadar gider ss3 e bak foto

        System.out.println(sonuc3);

        int sayi3=15;

        //System.out.println(10<sayi3<20); // java 3 lu karsılastırma kabul etmez 2 li karsilastirma yapip
                                            // mantiksal operatorlerle desteklemeliyiz


        System.out.println(10<sayi3 && sayi3<20);

        int sayi4=5;
        System.out.println(sayi4<10 || sayi4>20 );







    }
}
