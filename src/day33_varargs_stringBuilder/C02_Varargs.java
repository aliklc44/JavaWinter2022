package day33_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {
        // parametre olarak ir int
        // ve istedigimiz kadar string alan
        // en uzun kelimenin harf sayisi ile int variable parametre degerini
        // carpip sonucu yazdiran bir method olusturun

        int sayi = 5;
        String str1 = "Ali";
        String str3 = "Oguzhan";

        carpim(sayi,str1,str3);
        // bir methodda varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip varargsi en sona yazmaliyiz
        // bu sebeple bir methodla birden fazla varargs olamaz


    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr = "";

        for (String each:str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }

        System.out.println("istenen deger : " + sayi*enUzunStr.length());

    }
}
