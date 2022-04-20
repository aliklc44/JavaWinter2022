package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici

        //String case sensitive dir
        //yani pazar , PAZAR , Pazar hepsi farkli kelimedir

        //bu durumda String methodlarindan yardim aliriz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase(Locale.ROOT);//kullanici nasil yazarsa yazsin
        // biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");
        }






    }
}