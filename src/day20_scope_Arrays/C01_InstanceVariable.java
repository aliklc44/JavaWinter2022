package day20_scope_Arrays;

public class C01_InstanceVariable {

    int sayi;
    String bransIsmi = "Java";
    boolean okulAcikMi;

    public static void main(String[] args) {

        // sayi = 10; sayi variable i static olmadigi icin main method da direkt kullanilamaz
        // instance variablelara static methodlardan ulasabilmek icin obje olusturmamiz gerekir

        C01_InstanceVariable obj1 = new C01_InstanceVariable();
        System.out.println(obj1.sayi);
        obj1.sayi = 10;
        System.out.println(obj1.sayi);
        obj1.bransIsmi = "SQL";
        System.out.println(obj1.okulAcikMi);

        C01_InstanceVariable obj2 = new C01_InstanceVariable();
        System.out.println(obj2.sayi);
        System.out.println(obj2.bransIsmi);
    }
}
