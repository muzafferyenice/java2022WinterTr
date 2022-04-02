package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusYears(3).plusMonths(3).plusDays(15).plusHours(2).plusMinutes(45));


    }
}
