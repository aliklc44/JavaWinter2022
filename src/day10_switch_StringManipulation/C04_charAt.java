package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        // String de herhangi bir karakteri almak istedigimizde o karakterin index ini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str = "Java Cok Guzel";

        //  j yi yazdiralim

        System.out.println(str.charAt(0) );

        // g yi yazdirmak istiyosaniz
        System.out.println(str.charAt(9));

        // va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));

        // cOK yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                            ""+str.toUpperCase().charAt(6)+
                             str.toUpperCase().charAt(7));

        // son harfi yazdir
        // string de 14 harf ar sonn harfin index i 14-1
        System.out.println(str.charAt(14-1));



    }
}
