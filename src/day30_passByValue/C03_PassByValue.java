package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {
        // java pass by value bir programlama dilidir yani bir
        // variable i argument olaak bir methoda yollarsaniz
        // jaa o variable i degil degerini methoda yollar

        double etiketFiyat = 100;
        yuzdeOnIndirimYap(etiketFiyat);
        yuzdeOnIndirimYap(etiketFiyat);
        System.out.println("iki indirimden sonra main methodda etiket fiyati : " + etiketFiyat);

    }

    public static void yuzdeOnIndirimYap(double etiketFiyat) {

        etiketFiyat=etiketFiyat * 0.90;
        System.out.println("sizin icin %10 indirimli fiyatimiz : " + etiketFiyat);
    }
}
