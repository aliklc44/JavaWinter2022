package day40_overriding_pollymorphism;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        // kullanicidan iki sayi alip bolerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan= new Scanner(System.in);
        int kontrol = 0;
        while (kontrol!=2){

            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yaziniz");
            int sayi2 = scan.nextInt();


            try {
                System.out.println("sonuc = " +sayi1/sayi2);
            } catch (Exception e) {
                e.printStackTrace();
            }


            System.out.println("devam etmek icin 1 \nbitirmek icin 2 ye basin");
            kontrol=scan.nextInt();

        }

        /*
        sayi2 0 oldugunda sayi1 / 0 tanimsiz olacagindan java bu durumla karsilasinca
        exception verir
        javanin yazdigi mesajda hatanin ne tur bir sorun oldugu
        neden kaynaklandigi
        ve hangi satirda olustugu yazar

        bunu cozmek icin sayi2 yi if ile kontrol edebiliriz
        ama bu yontem her sorunda calismaz
         */

    //  if (sayi2==0){
    //      System.out.println("sayi / 0 tanimsizdir");
    //  }else {
    //      System.out.print("sonuc = " +sayi1/sayi2);
    //  }




    }
}
