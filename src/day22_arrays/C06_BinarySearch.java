package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {

    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 26;

        // binarySearch methodu bize istenen sayinin oldugu index i verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));// bize istedigimiz elementin indexini doner

        // eger olmayan bir elementi aratirsak
        // java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir

    }
}
