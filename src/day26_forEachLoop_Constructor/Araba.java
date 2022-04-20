package day26_forEachLoop_Constructor;

public class Araba {

    /*
     javada her class olusturdugumuzdaa
    java o classtan ilerde objeler uretmek gerekecegini bilir
    biz ozellikle belirtmesekte java her olusturdugu classa
    bir constructor koyar

    javanin class olustururken classa koydugu constructor a
    DEFAULT CONSTRUCTOR denir ve constructor gorunmez

    eger biz gorunur bir constructorimiz olsu istersek default constructor
     ile ayni gorevi yapan constructor olusturabiliriz veya
     istersek ayni kaliptan farkli desenlerde ojeler olusturmak icin farkli ozelliklerde
     constructorlerda olusturabiliriz

     constructorlari birbirlerinden farklilastiran tek ayricalik
     kullanilan parametre sayisi ve arametre data turu
     */

     public Araba() {
         System.out.println("parametresiz constructor calistir");
    }
    /* bir kod bulogunun method veya constructor olmasindan emin olmak istiyorsaniz
    iki seye dikkat emelisiniz

    comstructorlarin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar

    constructorlarin return type i olmaz

    ozetle constructorin adi class adi ile ayni olmali ve return type i olmamali
     */

    public Araba(String renk ){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");

        }


        public Araba(int yil, String renk){
            System.out.println(yil +" model "+ renk + " renginde bir araba uratildi");
        }
    }

