package day15_methodCreation;

public class C04 {
    // main method olmadan bir class olusturula bilir
    // ancak bu class direkt calismaz
    // sadece depo gorei gorur
    // baska classlardan kullanilabilecek method veya variablelari barindirir


    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdigiiniz kelimedeki harf sayisi : 5" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdigiiniz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);


    }


}