package day36_inheritance;

public class Memur extends Muhasebe {


    public static void main(String[] args) {

        Memur memur1 =new Memur();
    // memur1 objesi memur classinin objesin oldugu halse
        // inherit ettigi muhasebe ve onunda parenti olan personel
        // classlarindaki tum datalari alabilir

        // personel classindan
        memur1.personelNo=2002;
        memur1.isim="Ayse";
        memur1.soyIsim="Yuregil";
        memur1.adres="Balikesir";
        memur1.tel="321654987";

        // muhasebbe classindan
        memur1.saatUcreti=10;
        memur1.maas=memur1.massHesapla();
        memur1.statu="memur";
        System.out.println("memur1 = " + memur1);

        Memur memur2 = new Memur();
        memur2.personelNo=4562;
        memur2.saatUcreti=15;
        memur2.maas= memur2.massHesapla();

        System.out.println("memur2 = " + memur2);





    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }


}
