package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String arr1[] = {"Ali","Veli","Aysem"};
        // array icindei elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]); // Ali

        arr1[1]="Esila";

        System.out.println(arr1[1]);// Esila

        // arrayin icindeki index i kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int[4];

        System.out.println(arr2[1]); // 0
        System.out.println(arr2[3]); // 0

        // array in tamamini yazdirmak istersek

        System.out.println(arr2);// arrayler non-primitive olduklarindan direkt yazdirmak istersek
                                 // java referans bilgisini yazdirir

        for (int i = 0; i <4 ; i++) {
            System.out.println(arr2[i]);
        }

        // array i yazdirmak icin javadaki arrays classindan toString methodu kullaniriz

        System.out.println(Arrays.toString(arr1));

        arr2[1]=11;
        System.out.println(Arrays.toString(arr2));


    }
}
