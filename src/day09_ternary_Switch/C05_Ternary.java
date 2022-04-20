package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary deki 2 sonucun data turleri farkli olabillir

        // verile sayi 100 de buyukse sayi nin karesini alip yazdiran
        // 100 den kucukse sayi 100 den uyuk olmali yazdiran ir ternary olusturalim

        int sayi = 150;
        // ternary bize sonuc getirdiginden ya sonucu direkt yazdirmaliyiz veyabir degiskene atamaliyiz
        // eger sonuclar farkli data turlerinde ise atama yapacagimiz data turu tek olacagindan atama yapamayiz
        // sadece direkt yazdirabiliriz
        System.out.println(  sayi > 100 ? sayi * sayi : "sayi 100 den buyuk olmali");



    }
}
