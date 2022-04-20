package day29_staticKeyword;

public class C01_Static {

    String okulIsmi = "Yildiz Koleji";
    static String okulTel = "3122563635";

    public static void staticMethod(){
        System.out.println("Static method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
    }
}
