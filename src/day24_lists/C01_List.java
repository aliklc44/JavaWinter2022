package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {

    public static void main(String[] args) {

        int arr[]={};

        // bu array e 5 ekleyelim

        C06_Arrays obj= new C06_Arrays();
        arr=C06_Arrays.arrayeElemenEkle(arr,5);
        System.out.println(Arrays.toString(arr));// [5]

        // bir de 3 ekleyelim
        arr= C06_Arrays.arrayeElemenEkle(arr,3);
        System.out.println(Arrays.toString(arr));// [5, 3]

        // bir list olusturalim

        List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(2);
        sayilarList.add(5);
        sayilarList.add(1,3);
        System.out.println("sayilarList = " + sayilarList); //[2, 3, 5]
        sayilarList.add(0,6);
        sayilarList.add(2,8);
        System.out.println("sayilarList = " + sayilarList);







    }
}
