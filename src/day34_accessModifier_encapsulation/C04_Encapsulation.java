package day34_accessModifier_encapsulation;

public class C04_Encapsulation {

    public static void main(String[] args) {
        /* bir ariable i encapsule etmek icin
          1- access modifier i private
          2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlaya biliriz
          eger sadece okunmasini istiyorsaniz getter
          sadece deger girilebilsin isterseniz setter
          methodlarini olustururuz

          bir variable icin hem getter hem setter olusturursaniz
          o variable public olmus gibi hem okuyup hemde yazilmasini saglayabilirsiniz
           
         */

        C03 obj = new C03();



        System.out.println(obj.getSayi()); // 0

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());

        System.out.println(obj);


    }
}
