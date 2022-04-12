package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) {
        /*
        bir kood yazilirken olasi exception lar ongorulup exception olustugunda Java nin ne yapmasini
        istedigimiz belirtilmedildie
        1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak method isminin yanina
        olusabilecek exeption i deklare edebiliriz
        2- eger exeption olussa da kodun calismaya devam etmesini istiyorsak sorun olusturabilecek
        kodu try catch blogunun icine alir try bloguna sorun cikabilecek kodu
        catch bloguna olusabilecek exeption i ve olasi exeption durumunda javanin ne yapmasini
         istedigimizi yazabiliriz

        */
        String dosyaYolu="src/day41_exceptions/dosya";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
