package day40_overriding_pollymorphism;

public class C01 {

    public void method1(){
        System.out.println("parent method1 cAalisti");
    }

    protected void method2() {
        System.out.println("parent method2 cAalisti");
    }

    protected String method3(){

        return "Java";
    }

    private void method4(){
        System.out.println("parent method4");
    }
}
