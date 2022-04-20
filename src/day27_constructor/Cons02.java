package day27_constructor;

public class Cons02 {

    public static void main(String[] args) {

        Cons01 ob1 = new Cons01();
        /* Cons01 classinda  hic constructor olusturmazsak
         java default constructor i kullandigindan
         obj1 i uretebildik

         ancak biz parametreli veya parametresiz bir constructor yazdigimizda jaa default constructor i siler

         dolayisiyla biz herhangi bbir constaructor oolusturdugumuzda daha once baska classlarda
         veya kullanicilarin olsuturmus olabilecegi objeleri kullanabilmeleri icin
         default constructorin islevini gerceklestirecek parametresiz bir consttructor olusturmakta fayda var



         */

        Cons01 obj2 = new Cons01("Java");
    }
}
