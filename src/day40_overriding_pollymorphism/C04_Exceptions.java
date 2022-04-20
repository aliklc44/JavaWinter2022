package day40_overriding_pollymorphism;

public class C04_Exceptions {

    public static void main(String[] args) {

        // String olarak verilen bir sayiyi integera cevirip
        // 2 katini ekranda yazdiriniz

        String str = "1234a";


        // str icinde sayi disinda bir karakter olursa
        // exceptions verir



        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayinin iki kati : " + 2*sayi);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan karakterler iceriyor");
        }


    }
}
