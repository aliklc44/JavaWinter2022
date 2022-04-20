package day36_inheritance;

public class Child extends Parent {

    Child() {
        super();
        System.out.println("Child constructor calisti");
    }
    // tum classlarda iz gormesek bile javanin olusturdugu
    // default cons. vardir

    // extends keyword kullanan classlardaki
    // tum cons.lari ilk satirinda
    // biz gormesek bile super()
    // cost. call vardir
    // yani parent classin parametresiz const. call
    public static void main(String[] args) {

        Child child = new Child();


    }


}
