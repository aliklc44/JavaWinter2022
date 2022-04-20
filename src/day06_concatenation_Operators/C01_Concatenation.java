package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {
         String str1="Java";
         String str2="Guzel";
         int sayi1=5;
         int sayi2=3;

        //variablelari degerlerini degistirmeden asagidaki ifadeleri bunlari kullanarak yazdirin

        System.out.println(str1+sayi1+str2);

        //2guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Guzel
        System.out.println(""+sayi1+sayi2+str2);

        // eger tamamen sayilardan olusan bir String varsa ve biz bunu int a cevirirken istersek Integer.valueOf(str)
        //bir sayi String e cevirmek istersem ""+sayi

        




    }
}