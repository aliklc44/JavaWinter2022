package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {

    public static void main(String[] args) {

        // verilen bir array i listeye cevirin

        String arr[] = {"A", "B", "C"};
        List<String> arraydenList = Arrays.asList(arr);

        // arraydan liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz dolayisiyle
        // bu yeni list ile add remove clear gb methodlar calistirmak istedigimizde java exception olusur
        // arraydenList.add("J");
        System.out.println("arraydenList = " + arraydenList);

        arr[1]="F";
        System.out.println(Arrays.toString(arr));
        System.out.println("arraydenList = " + arraydenList);

        arraydenList.set(0,"Y");
        System.out.println(Arrays.toString(arr));
        System.out.println("arraydenList = " + arraydenList);

    }
}
