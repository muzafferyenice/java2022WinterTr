package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);

        int sayi1=10, sayi2= 20;
        System.out.println(sayi1+sayi2);

        String isim ="Muzaffer";
        String soyisim ="Yenice";
        System.out.println("isminiz: " + isim);
        System.out.println("soyisminiz:" + soyisim);

        short sayi3= 30;
        double sayi4=50; //virgullu sayi demek
        System.out.println("iki sayinin toplami:        " + (sayi3+sayi4));// parantezlere almazsan 50 ile 30 u yanyana yazar

        char ozelKarakter='#';
        System.out.println(ozelKarakter);

        int sayi5= 20;
        char harf='7';  //ASCII table sunum da var 7 yazarsan 55 ile topluyor slayt 40
         System.out.println(sayi5+harf);


    }
}
