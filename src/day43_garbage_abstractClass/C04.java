package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    bir abs classta abs veya conc methodlar buluna bilir child classlarin
    abs methodlari override etmesi mecburi iken
    conc methodlarin override edilmesi opsiyoneldir
     */

    public abstract void absMethod() ;

    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
    /*
    abs classlar constructor a sahiptir ancak
    abs classlardan obje olusturulamaz

    abs classlar obje barindirmayan
    sadece child classlar icin
    uyulmasi sart olan veya opsiyonel birakilan
    ozellikleri tanimladigimiz bir depo class gibidir
     */
     //   C04 obj = new C04();



    }





}
