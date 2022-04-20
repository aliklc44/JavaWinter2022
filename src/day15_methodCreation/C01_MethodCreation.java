package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // str in ilk dort harfini almak istesek
        System.out.println(str.substring(0,4));

        // bir program yaparken kodlarimizin daha kisa e anlasilir olmasi icin
        // surekli kullanabilecegimiz kod bloklarini hazir olarak bir yere koyar
        // ihtiyacimiz oldukca oradan alip kullaniriz

        // methodlar robotlara benzer
        // method olusturmakta bazen o method un yapacagi isi yapmaktan zor olabilir
        // bir islemi sadece bir kere yapacaksak method kullanmamiza gerek olmaya bilir
        // ancak ozellikle cok kullanacagimiz islemler icin her seferinde yeniden ayni kodlari yazmak yerine
        // bu isleri yapan hazir bir method olusturmak cok daha pratiktir

        // bazen bir class in icerisinde cok uzun kodlar yazarsak
        // tum class in anlasilmasi zor olabilir
        // bunun yerine kodun belli kisimlarini ayri method lar olarak olusturup
        // main method icerisinde istedigimiz sekilde bu methodlari yonetebiliriz




    }
}
