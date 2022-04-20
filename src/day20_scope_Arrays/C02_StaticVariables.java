package day20_scope_Arrays;

public class C02_StaticVariables {

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {

        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//0
        okulNo = 639;
        System.out.println(okulNo);//639
        System.out.println(okulAcikMi);//false

        staticMethod();

        System.out.println(okulNo);

    }
    public static void staticMethod(){

        okulNo = 500;
        System.out.println(okulNo);//500
    }
}
