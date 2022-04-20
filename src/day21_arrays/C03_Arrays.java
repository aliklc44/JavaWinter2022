package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int arr[]; // deger atamasi yapmadik ama java kabul etti ama kullanmamiza izin vermez

        arr= new int[6];
        System.out.println(Arrays.toString(arr)); //00000
        System.out.println(arr.length);// 6
                                       // String deki length() bunda yok

        // arraydeki her bir elemani index degeri kadar arttiralim

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += i;
        }

        System.out.println(Arrays.toString(arr));

        // son index deki elementi yazdiralim
        System.out.println(arr[arr.length-1]);// 5
    }
}
