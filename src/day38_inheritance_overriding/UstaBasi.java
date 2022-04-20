package day38_inheritance_overriding;

public class UstaBasi extends Isci {

    public String statu = "ustabasi";
    public String haklar = "haftada 1 gun ekstara tatil hakki";

    public void mesai() {
        System.out.println("ariza varsa eksta ucret almadan calisir ");
    }

    public void maasHesapla() {
        System.out.println("tum ustabasi 30 gun * 8 saat * 12 euro = " + (30 * 8 * 12) + " euro maas alir");
    }

    public static void main(String[] args){
        UstaBasi yasin = new UstaBasi();
        System.out.println(yasin.statu); // ustabasi
        System.out.println(yasin.haklar); // haftada 1 gun ekstara tatil hakki
        System.out.println(yasin.ikramiye); //isciler yilda 1 ikramiye alir
        System.out.println(yasin.izin); // tum personel yilda 4 hafta izin kullanabilir

        /*
        eger isci olarak ozelliklerini gormek istersek
        class adini isci seceriz
         */
        Isci ahmet = new UstaBasi();
        System.out.println(ahmet.statu);//isci
        System.out.println(ahmet.haklar);//kidem tazminat
        System.out.println(ahmet.ikramiye); //isciler yilda 1 ikramiye alir

        // siz bir ojeyi hangi classtan tanimlarsaniz
        // o classa ait ozelliklere sahip olur
        Personel adem = new UstaBasi();
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tum personnel esi haklara sahip
        //   System.out.println(adem.ikramiye); //CTE

        /*
         Personel adem = new UstaBasi(); bu bir ustabbasi objesi
         Personel adem = new personel(); bu personel objesi
         kesinlikle farkli
                  */

        /*
        Personel adem = new ustabasi();

        ademin data turu personel dir
        boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz
        ancak ben ademin ustabasi oldugunu iliyorum
        cunku cons. ustabasi
        ama bu yazim formati ile
        ademin tum personel ile birlikte sahip oldugu ortak ozellikleri vurgulamak isriyorum

        bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent classlarindaki variablelari kullanabilir
         */


    }
}
