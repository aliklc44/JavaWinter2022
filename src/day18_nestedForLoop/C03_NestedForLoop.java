package day18_nestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        // *
        // * *
        // * * *
        // * * * *

        int input = 5;
        int input2 = 8;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i; j++) {// nested for loop ya dikdortgen formatinda olabilir veya ucgen olabilir
                // dikdorgen istedigimizde iki loop icinde bagimsiz end point belirleriz
                // ucgen icin inner loop un end pointi olarak outer degiskene baglariz

                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
