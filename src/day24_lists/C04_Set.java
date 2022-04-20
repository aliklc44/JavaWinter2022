package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Sueda");
        isimler.add(0, "Iskender");
        isimler.add("Sudenur");
        isimler.add(1, "Ayse");
        System.out.println("isimler = " + isimler);

        isimler.set(2,"ExSueda");
        System.out.println("isimler = " + isimler);

        System.out.println(isimler.set(2,"Sueda"));
        System.out.println("isimler = " + isimler);

        // daha onceden listeden varolanlari  da arsiv gibi tutmak istersek
        List <String> logListesi = new ArrayList<>();

       logListesi.add (isimler.set(2,"Adeus"));
        System.out.println("isimler = " + isimler);
        System.out.println("logListesi = " + logListesi);
    }
}
