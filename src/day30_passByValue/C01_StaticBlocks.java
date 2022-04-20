package day30_passByValue;

public class C01_StaticBlocks {

    static{// class calismaya baslamadan yapmamiz gereken on atamalar varsa onlari yapar
        /* static block class ilk calismaya basladiginda devreye girer
        ve classsi calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir oemi yoktur
        class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa blocklar yukaridan asagi dogru calisir
         */
        System.out.println("static block calisti");
    }

    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method baslangici");
        C01_StaticBlocks obj1 ;
        new C01_StaticBlocks();
        System.out.println("main method sonu");



    }


}
