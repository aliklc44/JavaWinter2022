package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(1, 3);
        sayilar.add(0, 6);
        sayilar.add(2, 8);
        System.out.println("sayilar = " + sayilar);

        // sayilar.remove(5);
        // sayilardan olusan bir listte objeyi vererek elemet silme methodu calismaz
        // sayi degeri girdigimizde java otomatik olarak sayiyi index kabul eder

     //   int sayi = 5;
       // sayilar.remove(sayi);

        Integer sayi = 5;
        sayilar.remove(sayi);
        System.out.println(sayilar);// [6, 2, 8, 3]





    }
}
