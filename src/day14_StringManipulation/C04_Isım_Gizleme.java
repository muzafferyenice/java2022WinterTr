package day14_StringManipulation;

public class C04_Isım_Gizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim="Oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");//space olmayan herseyi yildiz yap
        String yeniSoyIsim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","+");

        String yenikKno="**** **** **** " + kKno.substring(12);

        System.out.println(yeniIsim+" "+ yeniSoyIsim+"\n"+yenikKno);




    }
}
