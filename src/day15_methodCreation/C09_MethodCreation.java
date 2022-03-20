package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="Oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        isimSoyisimGizle(isim,soyisim);
        String gizlenmisKKNo = krediKartiGizle(kKno);
        System.out.println(gizlenmisKKNo);



    }

    public static String krediKartiGizle(String kKno) {
        String yenikKno="**** **** **** " + kKno.substring(12);
        return yenikKno;                                        // return yaparak veri yi kendimize aldik
    }

    public static void isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");//space olmayan herseyi yildiz yap
        String yeniSoyIsim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","+");
        System.out.println(yeniIsim+yeniSoyIsim);
                                                                      // yazdirdik burda
    }
}
