package day16_methodCreation;

public class C03_Overloading {

    public static void main(String[] args) {

        // verilen iki sayiyi toplayip yazdiran bir method olusturalim

        int a = 10;
        int b = 20;

        ikiSayiTopla(a,b);

        double c = 22.2;
        double d = 11.1;

        ikiSayiTopla(c,d);

ikiSayiTopla(58,14);
ikiSayiTopla(14.5,23.5);

// bir int bir double sayiyi toplayalim

        int sayi1 = 5;
        double sayi2 = 2.2;

     ikiSayiTopla(sayi1,sayi2);

}
    private static void ikiSayiTopla(int c, double d) {
        System.out.println("bir integer bir double sayi toplam : " + (c + d));

    }


        private static void ikiSayiTopla(double c, double d) {
        System.out.println("iki double sayi toplam : "+ (c+d));
    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("iki integer sayi toplam : "+ (a+b));
    }
}