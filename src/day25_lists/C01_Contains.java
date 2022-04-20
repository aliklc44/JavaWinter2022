package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1, "T");
        harfler.add(0, "T");

        System.out.println("harfler = " + harfler); //[T, D, T, M]

        System.out.println(harfler.contains("T"));

        List<String> karakterler = new ArrayList<>();
        karakterler.add("S");
        karakterler.add("M");

        System.out.println( harfler.containsAll(karakterler));




    }
}
