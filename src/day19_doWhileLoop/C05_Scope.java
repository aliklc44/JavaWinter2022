package day19_doWhileLoop;

public class C05_Scope {
    // bir method icerisindde olusturulan variable sadece olusturulduklari methodlarda kullanilailir
    // baska methodda kullanilamaz

    // tum methodlarin kullanabilmasini istedigimiz variablelari class level da olustururuz
    // class levelde olusturlduguuz ariable i static yaparsak tum methodlar kullanabilir
    // static olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir

    // loop icinde olusturlan variablelar loop icerisinde kullanilabilir
    // ama loop un disinda kullanilamaz

    static String kurs = "Java";
    int level = 10;
    static int sayi;

    public static void main(String[] args) {

        int sayi = 10;
        // isim = "Su";
        System.out.println(kurs);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayi = 20;
        }


    }


    public static void method1() {
        String isim = "Sueda";
        System.out.println(kurs);
    }

    public void method2() {
        System.out.println(kurs);
        level = 20;
    }
}
