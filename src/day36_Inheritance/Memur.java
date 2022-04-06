package day36_Inheritance;

public class Memur extends Muhasebe{




    public static void main(String[] args) {


        Memur memur1 =new Memur();
        //memur1 objesi mmemur class inin objesi olmasina ragmen
        //inherit ettigi muhasebe ve onun da parent i olan personel
        // class larindaki tum datalari olabilir

        //personel class indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepeli";
        memur1.adres="Ankara";
        memur1.tel="3123365455";

        //muhasebe class indan
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2 =new Memur();
        memur2.persNo=1002;
        //memur2.isim="Ahmet";
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        memur2.tel="31233654555555";
        System.out.println(memur2);

    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
