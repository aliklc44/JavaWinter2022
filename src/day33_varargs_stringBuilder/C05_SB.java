package day33_varargs_stringBuilder;

public class C05_SB {

    public static void main(String[] args) {
/*
compare iki sb yi ilk harften aslayarak tum karakterleri karsilastirir
ayni olan karakterler icin bir sey yazdirmaz
farkli olan ilk karakter icin kac aski talosuna gore kac dege geride veya ileride oldugunu yazdirir

bir sb ile stringi compare edersek  cte verir
 */
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Aii can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2));


    }
}
