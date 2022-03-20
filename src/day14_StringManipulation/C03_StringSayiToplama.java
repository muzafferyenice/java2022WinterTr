package day14_StringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //  String str1 = “$13.99”
        //  String str2 = “$10.55”
        //  ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", "");//1399 ama String olarak
        str2 = str2.replaceAll("\\D", "");//1055 "              "

        double str1Sayi = Double.parseDouble(str1);
        double str2Sayi = Double.valueOf(str2);

        System.out.println(("$" + (str2Sayi+str1Sayi)/100));


    }
}
