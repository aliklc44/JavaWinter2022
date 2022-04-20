package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi = -120;
        //verilen sayinin 3 basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bi ternary yazin

       String sonuc= sayi >= 100 ? "Sayi 3 basamakli veya daha buyuk" : "sayi negatif veya  3 basamaktan kucuk";

       // ternary bize sonuc dondurdugu icin
        //ya bu sonucun data turune  uygun ir variable a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);






    }
}
