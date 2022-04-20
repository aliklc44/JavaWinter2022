package day39_overriding;

public class Corolla extends Toyota {
    protected  String hiz = "Corolla max 200 km hiz yapar";
    protected  String yakit = "Corolla bezinli veya elektiklidir";
    protected String model = "Corolla";

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");

    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        data turu ve cons. farkli oldugunda
        cons. calistigi icin obje cons. oldugu
        class ozelliklerini tasir
        ancak data turu parent class secildigi icin
        variablelar data turunun secildigi class ve
        onun parent classlarindan deger alabilir

        methodlar icin ise yine data turunun oldugu classa gideriz
        ancak direkt methodu calistirmadan once
        method override edilmis mi diye kontrol ederiz
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hiz); // corolla
        System.out.println(arb1.yakit); // corolla
        System.out.println(arb1.sirketMerkezi); // toyota
        System.out.println(arb1.marka); // toyota
        System.out.println(arb1.model); // corolla
        arb1.motor(); // corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // araba
        System.out.println(arb2.hiz); // toyota
        System.out.println(arb2.yakit); // araba
        System.out.println(arb2.sirketMerkezi); // toyota
        System.out.println(arb2.marka); // toyota
        arb2.motor(); //

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // araba
        System.out.println(arb3.hiz); // araba
        System.out.println(arb3.yakit); // araba
        //System.out.println(arb3.sirketMerkezi); // CTE
        System.out.println(arb3.marka); // araba
        //System.out.println(arb3.model); // CTE






    }
}
