package day17_forLoop;

import java.util.Scanner;

public class C09_TerstenYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin
        // bu Stringi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.next();

        for (int i = kelime.length() - 1; i <= 0; i--) {
            System.out.println(kelime.substring(i, i + 1));


        }
    }
}