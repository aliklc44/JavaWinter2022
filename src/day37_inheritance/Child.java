package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir classi child class yaptigimizda
    // parent classtaki constructora ulasmasi gerekir
    // bu durumda parent classtaki constructorin
    // access modifieri public veya protected olmalidir



    Child() {
        super();
        System.out.println("child class parametresiz cons.");
    }
    Child(int s){
        // child classta tum constructorlarin ilk satirina javanin
        // yerlestirdigi constructor PARAMETRESIZ dir yani super();
        System.out.println("child class parametreli cons");
    }

    Child(int sayi1,int sayi2){
        // eger parent classtan parametresiz consi degilde
        // baska bir consi calistirmak isterseniz
        // bunu child classtaki consin ilk satirina yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("2 parametreli cons");
    }

    public static void main(String[] args) {

        Child child = new Child(5,8);

    }

}
