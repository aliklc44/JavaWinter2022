package day31_immutableClasses;

public class C01_Equals {

    public static void main(String[] args) {

        String str = "Eren";
        String str2="Eren";

        String str3 = new String("Eren");

        String str4 = str+"";

        System.out.println(str.equals(str2));// true
        System.out.println(str.equals(str3));// true
        System.out.println(str.equals(str4));// true

        System.out.println(str==str2);// true
        System.out.println(str==str3);// false
        System.out.println(str==str4);// false


    }
}
