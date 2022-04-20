package day34_accessModifier_encapsulation;

public class C01 {
    private static int sayi =10;
    private static String  str ="Java";
    static int acikSayi = 20;
    String acikStr="Hello";
    public static int halkaAcikSayi = 50;
    protected static int aileyeOzel = 40;

     protected C01(){

    }
    private void method1(){


    }

    C01(int numara){
        System.out.println("parametreli construkter calisti");
    }


}
