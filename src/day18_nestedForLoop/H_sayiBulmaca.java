package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {

    public static void main(String[] args) {

        // bilgisyara 1-100 sayi tutturun
        // kullanicidan bu sayiyi tamin etmesini isteyin
        // girilen her tahminde sayi buyult veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde buldugunu kullaniciya yazdirin

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);// burasi 100 den kucuk rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin){
            System.out.print("Lutfen bir sayi tahmin edin : ");
            tahmin=scan.nextInt();

            if (tahmin>sayi) {
                System.out.println("Daha kucuk bir sayi dusunmelisin");
                sayac++;
            }else if(tahmin<sayi){
                System.out.println("Daha buyuk bir sayi dusunmelisin");
                sayac++;
            }

        }

        System.out.println("Sayiyi : " + (sayac-1) + " tahminde buldunuz TEBRIKLEEERR :)");
    }
}
