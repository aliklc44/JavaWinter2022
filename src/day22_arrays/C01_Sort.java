package day22_arrays;

import java.util.Arrays;

public class C01_Sort {

    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "T"};
        System.out.println(Arrays.toString(arr));// s m a t

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// a m s t
        // Java da bu siralamaya Natura Order denir
        // sayi olursa kucukten buyuge
        // metin olursa alfabetik sira



    }
}
