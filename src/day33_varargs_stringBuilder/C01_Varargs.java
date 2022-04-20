package day33_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Samet";

        // yazilan argument sayisi sabitse her zamanki gibi bir method olusturabiliriz
        // ancak argument sayisi degisme ihtimali varsa
        // o zaman arargs tercih edilir
        enUzunKelime(str1,str2,str3,str4);


    }

    private static void enUzunKelime(String... str) {
        String enUzunStr = "";

        for (String each:str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("enUzunStr = " + enUzunStr);
    }


}
