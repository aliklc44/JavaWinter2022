package day04_dataCasting_increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);//30
        System.out.println(sayi);//20

       //eger atama yapmazsak sayida yaptigimiz arttırma veya azaltma kalici olmaz

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+10);//40
        System.out.println(sayi);//40

        System.out.println(sayi+=10);//50
        System.out.println(sayi);//50

        //bir vvariable in degerini kalıcı olarak arttirmak veya azaltmak isterseniz assigment sart

        System.out.println(sayi++);//50
        System.out.println(sayi);//51



    }
}
