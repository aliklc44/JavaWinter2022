package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Sueda");
        isimler.add(0, "Iskender");
        isimler.add("Sudenur");
        isimler.add(1, "Ayse");
        System.out.println("isimler = " + isimler);

        boolean sonuc = isimler.remove("Sueda");

        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }
        System.out.println("isimler = " + isimler);
        System.out.println("sonuc = " + sonuc);

        sonuc = isimler.remove("Esila");
        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        // remove index yazdigimizda sildim silmedim ihtimali kalmaz
        // bize remove edilen elementi doner

        System.out.println(isimler.remove(1));

    }
}
