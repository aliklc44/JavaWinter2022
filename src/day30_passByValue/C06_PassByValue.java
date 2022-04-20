package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {

    public static void main(String[] args) {
        /* non primitive lerde objenin kendisi degilde objenin kendisi degisirse
        java objenin referansi ve objenin kendisi degismedigi icin element
         */

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("sonra "+ Arrays.toString(arr));
    }

    private static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
