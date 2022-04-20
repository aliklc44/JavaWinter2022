package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi isteyin tek eya cift oldugunu yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi % 2 != 0) {
            System.out.println("girilen sayi tek sayi");
        }

        //normalde bir tam sayi ya tektir ya cifttir
        //o zman tek olması veya cift olması iki ayrı if ile degil if else ile yapmak daha guzel olur
        // ========= if else ile cozum======

        if (sayi % 2 == 0) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }



    }
}