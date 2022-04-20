package day04_dataCasting_increment;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);

        //java 2 int sayıyı birbirine bölerse sonucuda int olarak verir
        //eger virgulden sonra kusurat varsa siler

        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=4895;
        double sayi3=10;
        //sayi1=sayi1/sayi3;
        // java iki farkli sayi data turunu isleme koydugumuzda
        //kucuk olan tur icin autoWidening yapar
        //bu islemi dusunursek islemin sonucunu double kabul ediyor
        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);








    }
}
