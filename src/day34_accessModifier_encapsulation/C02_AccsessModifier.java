package day34_accessModifier_encapsulation;

public class C02_AccsessModifier {

    public static void main(String[] args) {

        C01 obj = new C01();
        obj.acikStr="Bye";
        C01.acikSayi=50;

        C01 objParametreli= new C01(5);
    }
}
