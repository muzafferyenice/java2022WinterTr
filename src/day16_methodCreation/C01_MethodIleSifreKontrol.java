package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolu method ile yap

        String sifre = "asd1 23";

        boolean ilkHarfKontrol = ilkHarfKontrolet(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol&& boslukKontrol&&uzunlukKontrol){
            System.out.println("Sifre basari ile tanimlandi");
        }
    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;

        }else{
            System.out.println("sifre en az 8 karakter olmali");
        }

        return uzunlukKontrolSonuc;
    }


    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }
           return boslukKontrolSonuc;
        }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf =sifre.charAt(sifre.length()-1);

        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("sifre son harf kucuk harf olmali");
        }
        return sonHarfSonuc;

    }

    private static boolean ilkHarfKontrolet(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;

        if(ilkHarf>='A'&& ilkHarf<='Z' ){
            ilkHarfSonuc=true;
        }else {
            System.out.println("sifre ilk harf buyuk olmali");
            //ilkHarfSonuc=false;
        }
        return ilkHarfSonuc;



    }
}