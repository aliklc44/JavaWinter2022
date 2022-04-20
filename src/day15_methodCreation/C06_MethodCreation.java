package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // verilen iki sayiyi toplayip yazdiran bir method olusturalim

        ikiSayiToplam(a,b);




    }

    private static void ikiSayiToplam(int a, int b) {
        System.out.println(a+b);
    }
}