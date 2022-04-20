package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {

        // string i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazan bir method

        hosgeldinYazdir();

    }

   public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }
    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdirMethodu("Boylede olur");
    }
   public static void stringYazdirMethodu(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
