package day39_overriding;

public class OverridingChild extends OverridingParent {

    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        /*
        bir obje olusturulurken data turu ve cons. ayni classtan secilmisse
        java direkt o classa gider hem variable hemde method icin
        o classta varsa kullanir yoksa o classin parentlarina bakar
         */

        OverridingChild obj1 = new OverridingChild();
        obj1.method1(); // child
        obj1.method2(); // parent

        OverridingParent obj3 = new OverridingParent();
        obj3.method2(); // parent
        obj3.method1(); // parent

        /*
        eger data turu parent cons. child classtan secildiyse
        variablelarda yukaridaki sekilde calisma devam eder
        ancak
        methodlar icin data turunun oldugu classdaki method
        child class tarafindn override edilmis mi dite kontrol etmemiz gerekir
        eger child classalrda bu method override edilmisse
        override eden method calisir
         */

        OverridingParent obj2 = new OverridingChild();
        obj2.method2(); // parent
        obj2.method1(); // child

    }
}
