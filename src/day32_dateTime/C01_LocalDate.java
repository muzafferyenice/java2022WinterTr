package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now(); // objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1990,8,23);
        // istedigimiz yil ay ve gun degerine gore bize obje olusturur

        System.out.println(trh);   // 2022-04-01
        System.out.println(trh.atStartOfDay());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());

        //bir tarihten ileri geri gidebiliriz

        System.out.println(trh.minusWeeks(16));
        System.out.println(trh.minusWeeks(15).minusDays(6));

        System.out.println(trh.plusMonths(9).plusDays(10));


        System.out.println(LocalDate.now().isLeapYear());
        //istedigimiz ulkenin tarihi
        LocalDate trhZone= LocalDate.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(trhZone);

        System.out.println(trh.isAfter(baskaTrh));




    }
}
