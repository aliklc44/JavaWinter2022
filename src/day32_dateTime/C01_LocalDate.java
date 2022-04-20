package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate trh= LocalDate.now();//ojenin olusturuldugu tarihi trhye atar
        LocalDate baskaTrh = LocalDate.of(2003,2,2);
        // istedgimiz yil ay e gun degerlerine gore bize obje olusturur

        System.out.println(trh);// 2022-03-31

        System.out.println(trh.getDayOfMonth());// 31
        System.out.println(trh.getDayOfWeek()); // THURSDAY
        System.out.println(trh.getMonthValue()); // 3

        // bir tarihte istedigimiz kadar ileri yada geri gidebiliriz


        System.out.println(trh.minusWeeks(20)); //2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        System.out.println(LocalDate.now().isLeapYear()); // false
    }
}
