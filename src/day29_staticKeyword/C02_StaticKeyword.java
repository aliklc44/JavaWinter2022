package day29_staticKeyword;

public class C02_StaticKeyword {

    public static void main(String[] args) {

        // baska classtaki static class uyelerine ulasabilmek icin
        // sadece classIsmi.staticUyeIsmi
        // yazmamiz yeterli

        System.out.println(C01_Static.okulTel);

        C01_Static.okulTel="12356789";
        System.out.println(C01_Static.okulTel);

        // baska classtaki static olmayan class uyelerine ancak o classtanobje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerlidir
        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println( obj2.okulIsmi);// Yildiz Koleji
        obj2.okulIsmi = "Sabir Koleji";
        System.out.println( obj1.okulIsmi);// Yildiz Koleji
        System.out.println( obj2.okulIsmi);// Sabir Koleji
    }
}
