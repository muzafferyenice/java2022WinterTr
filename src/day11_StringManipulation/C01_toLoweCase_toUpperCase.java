package day11_StringManipulation;

import java.util.Locale;

public class C01_toLoweCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

         // biz string methodlarini arka arkaya kullanabiliriz
        // Biz string method'larini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk gharfini kucuk olarak yazdiralim
        // str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisiyla String'de yapmak istegimiz tum degisiklikleri
        // once yapip sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}
