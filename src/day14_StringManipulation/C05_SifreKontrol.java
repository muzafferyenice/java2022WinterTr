package day14_StringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        String sifre="Asdf121rtha";

        boolean ilkHarf=false;

        if(sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z' ){
            ilkHarf=true;
        }else {
            System.out.println("sifre ilk harf buyuk olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && (sifre.length()-1)<='z'){
            sonHarf=true;
        }else {
            System.out.println("sifre son harf kucuk harf oolmali");
        }

        boolean bosluk = false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;

        }else{
            System.out.println("sifre en az 8 karakter olmali");
        }

        if (ilkHarf&&sonHarf&&bosluk&&uzunluk){
            System.out.println("sifreniz kaydedildi");
        }
        String str = "iyi geceler";
        System.out.println(str.endsWith(""));

    }
}
