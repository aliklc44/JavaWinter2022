package day45_interfaces;

public interface I01_Default_Static {

    /*
    interface lerde sadece abs methodlar bulunur
    bodysi olan concrete bir method olusturmak istedgimizde
     java CTE verir

     ancak java8 ve uzeri versiyonlarda istisnai olarak
     static veya default olarak tanimlanan methodlarin
     bodysi olabilir
     ancak buarda kullanilan default keywordu access modifier degildir
     cunku interfacelerde tum methodlar public ve absydi

     asagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir methoda
     access modifier olarak public yazabilirsiniz
     (access modifier yazmasakda java methodu public olarak kabul edecektir)
     */

    void method1();

    public default void method2() {
        System.out.println("interface deki default method");
    }

    static void method3() {
        System.out.println("interfacedeki static method");
    }



}
