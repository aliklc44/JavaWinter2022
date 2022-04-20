package day40_overriding_pollymorphism;

public class C02 extends C01 {


    private void method4(){
        System.out.println("child method4");
        // parent classtaki private method4 e
        // child classtan ulasmamiz mumkun olmadigindan
        // bu iki methodu tamamen farkli iki method
        // olarak kabul eder
    }

    @Override
    protected String method3() {
    // covariant icin yazildi
        return "Java";
    }

    @Override
    public void method2() {
        /*
        @Override notasyonu overridden method ile overriding methodu
        birbirine baglar dolayisiyla
        farkinda olunmadan overriden method silinirse signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        notasyon kullanilmazsa java bunlarin iliskisini bilir ama
        overriden method silinirse sesini cikarmaz
         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        C02 obj1 = new C02();

        obj1.method1(); // parent method1 calisti
        obj1.method2(); // Child method2

        C01 obj2 = new C02();
        obj2.method1(); // parent method1 calisti
        obj2.method2(); // Child method2

        C01 obj3 = new C01();
        obj3.method1(); // parent method1 calisti
        obj3.method2(); // parent method2 calisti


    }

}
