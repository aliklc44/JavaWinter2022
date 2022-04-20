package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(1, 3);
        sayilar.add(0, 6);
        sayilar.add(2, 8);//[6, 2, 8, 3, 5]

        System.out.println(sayilar.get(2));
    }
}
