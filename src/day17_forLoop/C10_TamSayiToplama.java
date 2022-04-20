package day17_forLoop;

public class C10_TamSayiToplama {

    public static void main(String[] args) {

        // kullanicidan iki sayi isteyin
        // girilen sayilari e aralarindaki tum sayilari toplayip
        // yazdiran bir program yazdirin

        int a = 10;
        int b = 20;
        int toplam = 0;

        for (int i = a; i <=b ; i++) {
           toplam += i;
        }
        System.out.println(toplam);

    }
}
