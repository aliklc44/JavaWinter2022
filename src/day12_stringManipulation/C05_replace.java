package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str = "Bugun ne cok sey ogrendik";

        // bu cumledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println("space haric karakter sayisi : " + str.replace(" ","").length());

        // atama yapilmadigi surece orjinal string kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : " + str.length());



    }
}
