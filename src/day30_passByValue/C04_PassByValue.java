package day30_passByValue;

public class C04_PassByValue {
// eger bir metodda yapilan degisikligin kalici olmasini istiyorsak iki yontem kullanabiliriz
    // 1 - variablei class levelde static olarak olsuturabilirim

    static double etiketFiyat ;
    static double indirimYuzdesi;

    public static void main(String[] args) {

    etiketFiyat=100;
    indirimYuzdesi=10;
        kaliciIndirimYap();

    }
    public static void kaliciIndirimYap(){
        etiketFiyat=etiketFiyat*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : " + etiketFiyat);
    }



}
