package day12_StringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr

        String email="mulkiyeayboy@gmail.com.tr";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){      // ! isareti olumsuzluk katar yani icermiyorsa olur (if not)
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.lastIndexOf(arananMetin)==(email.length()-10)){ // -10 nerden geldi @gmail.com lenght-
            System.out.println("Email adresiniz kaydedildi");                                                                           //10987654321
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }
    }
}
