package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(2003,02,02);

        System.out.println(Period.between(dogumGunu,bugun));

        System.out.println(Period.between(dogumGunu,bugun).getYears());
    }
}
