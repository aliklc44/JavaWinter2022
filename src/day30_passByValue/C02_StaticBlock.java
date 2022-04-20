package day30_passByValue;

public class C02_StaticBlock {

    {
        /*
        static olmayan blocklAR obje olusturukurken calisir

        static blocklar sadece bir kere en basta calisir ama static olmayan blocklar her objede olsuturulurken
        yeniden calisir
         */
        System.out.println("static olmayan block calisti");
    }

    static{
        System.out.println("static olan block calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method basi");
        C02_StaticBlock obj1 = new C02_StaticBlock();
        C02_StaticBlock obj2 = new C02_StaticBlock();


    }


}
