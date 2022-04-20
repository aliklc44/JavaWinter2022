package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Scanner kullanmak icin 3 adım takip ediyoruz
        //1. adım kendimize scanner olusturuyoruz
        Scanner scan = new Scanner(System.in);
        //2. adım kullanicidan istedigimiz degeri girmesi icin acıklayıcı bir bilgi yazdırın
        System.out.println("Lutfen isminizi giriniz");
        //3. adım kullanicinin girdigi degeri uygun bir variable olusturup kaydet
       // String kullaniciIsmi=scan.next();
        String kullaniciIsmi=scan.nextLine();
        System.out.println("kullanicinin girdigi isim : " + kullaniciIsmi);












    }






}







