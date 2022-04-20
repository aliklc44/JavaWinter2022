package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz" +
                "\nkadin icin K \nerkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
        } else if (cinsiyet == 'E') {
        } else {
            System.out.println("lutfen cinsiyet icin gecerli bir harf giriniz");
        }

    }
}
