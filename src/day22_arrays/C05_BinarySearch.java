package day22_arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        // verilen array de istenen elementin var olup olmadigini true ya da false olarak gosteren bir method olusturun
        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 5;

        istenenElemanVarMi(arr,istenenSayi);

        // eger javada hazir BinarySearch ile yapmak isterseniz
        // once sort methodunu kullanip
        // sonra binarySearch yapmaliyiz

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc = false;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenenSayi){
                sonuc=true;
                break;
            }
        }


        System.out.println(sonuc);

    }
}
