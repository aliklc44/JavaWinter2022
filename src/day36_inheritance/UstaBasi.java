package day36_inheritance;

public class UstaBasi extends Isci{

    public static void main(String[] args) {

        UstaBasi ustaBasi1 = new UstaBasi();
        ustaBasi1.saatUcreti = 15;
        ustaBasi1.isim = "Murat";
        ustaBasi1.soyIsim="Gokcek";
        ustaBasi1.maas = ustaBasi1.massHesapla();
        ustaBasi1.statu = "Isci";
        ustaBasi1.isciStatu = "Ustabasi";
        System.out.println("ustaBasi1 = " + ustaBasi1);




    }


    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ",\n saatUcreti=" + saatUcreti +
                ",\n statu='" + statu + '\'' +
                ",\n maas=" + maas +
                ",\n personelNo=" + personelNo +
                ",\n isim='" + isim + '\'' +
                ",\n soyIsim='" + soyIsim + '\'' +
                ",\n adres='" + adres + '\'' +
                ",\n tel='" + tel + '\'' +
                '}';
    }
}
