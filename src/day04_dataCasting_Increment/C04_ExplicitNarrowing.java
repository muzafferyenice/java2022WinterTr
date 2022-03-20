package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1= 879;
        double sayi2 = 10;

        double sayi3= sayi1/sayi2;
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2);//veya sayi1/(int)sayi2 de olur
                                //deger double variable int java bunu yapmaz

        System.out.println(sayi4);

        int sayi5=140;
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6); // burayı anlamazsan java 4 videosunun 2saat 18 dk izle

        sayi5=260;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=127;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);


    }
}
