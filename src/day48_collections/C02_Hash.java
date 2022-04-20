package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str1 = "Java cok guzel";
        System.out.println(str1.hashCode()); // -481588044

        String str2 = "Hva cok guzel";
        System.out.println(str2.hashCode()); //  1315152421

        Set<Integer> sayiKumesi = new HashSet<>();
        System.out.println(sayiKumesi.hashCode());  // 0
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());
    }
}
