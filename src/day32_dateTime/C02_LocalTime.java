package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm= LocalTime.now();
        System.out.println(tm);

        int sayi=0;
        for (int i =0; i<100000 ; i++){
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1)+ " nano saniyede bitt");

        /*bir islemin ne kadar zamanda bittigini bulmak istersek islemden once ve sonra birer time objesi olusturup
        aradaki farki hesaplayabiliriz
         */

        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        // istedigimiz bolgenin de saati icn de obje olusturabiliriz
        LocalTime tmZone= LocalTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println(tmZone);


    }
}
