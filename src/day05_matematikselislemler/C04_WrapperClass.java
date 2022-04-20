package day05_matematikselislemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
 //primitive data turu ile non-primitive arasindaki farklar?

        String str="Java";
        int sayi=10;
        System.out.println(str.toUpperCase());
        System.out.println(str);

        //non-primitive data turleri data depolamak yaninda bir cok faydali methoda sahiptir
        //ancak primitivelerin boyle bir ozelligi yoktur
        //primitive sadece degerleri saklar(container)
        //primitiv türler icin bazi methodlar gerekli oldugunda java ara ir cozum uretmistir
        //java her bir primitive turunu  non-primitive olarak kullana bilmek icin ozel classlar olusurmus
        //bunlara Wrapper class adini vermis

        double sayi2=20.5;
        //sayi2 primitive oldugundan sayi2. dedigimizde method gelmez
        Double sayi3=15.2;
        //sayi3 wrapper class olan Double clasını kullandıgından sayi3. dedigimizde bir cok method gelir


    }
}
