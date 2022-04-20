package day19_doWhileLoop;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alip
        // while loop ile sayidan kucuk pozitif tam sayilari yazdiralim

        int input = 5;
        int sayi = 1;


        while (sayi < input) {
            System.out.println(sayi);
            sayi++;

        }

        // ayni soruyu do while loopla yapalim
        sayi = 1;
        do {
            System.out.print(sayi + " ");
            sayi++;
        }while (sayi<input);







    }
}
