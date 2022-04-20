package day06_concatenation_Operators;

public class C02_MantıkOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;//true
        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;//false
        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;//false
        System.out.println(sonuc3);

        // && ile & arasindaki fark

        int sayi3=15;
        //sayi3 un taralı bölgede oldugunu ispatla 10-20
        //java uclu karsilastirma kapul etmez
        System.out.println(10<sayi3 && sayi3<20);

        int sayi4=5;
        //sayi4 un 10-15 olmadigini true diyerek dondur
        System.out.println(sayi4<10 || sayi4>20);


    }
}
