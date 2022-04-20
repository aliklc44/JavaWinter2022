package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5));// ile IT cok guzel
        // yukaridaki string i kullanarak mehmet hoca ile it cok guzel yapalim

        System.out.println(str.replace("Java","Mehmet Hoca"));

        System.out.println("Mehmet Hoca " + str.substring(5));

        System.out.println(str.substring(9)); // yazilan index inclusive

        // eger bir indexx ten sona kadar ollan parcayi degilde
        // belirli bir parcayi almak isteersek
        // 2 parametre yazmak gerekiyor str.substring(baslangicIndexi, bittisIndexi)
        // baslangic index dahil son index dahl degil

        System.out.println(str.substring(0,6));// Java i

        System.out.println(str.substring(0,1));

        System.out.println(str.substring(5,6));

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));// hiclik dondurur

       // System.out.println(str.substring(5,2)); // bitis index i baslangictan kucuk olamaz

        System.out.println(str.substring(str.length()-1));// son harfi verir
        System.out.println(str.substring(str.length()-5));// son bes harfi yazdiralim
        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir








    }
}
