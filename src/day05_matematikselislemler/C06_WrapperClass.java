package day05_matematikselislemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki string deki sayilari toplayin

        System.out.println(str1 + str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        //Integer.valueOf(str1) metthodu sadece sayisal deger icere Sttring lerde kullanilabilir
        //ir tane bile sayi disinda karakter olursa java hata verir



    }
}
