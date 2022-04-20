package day36_inheritance;

public class Muhasebe extends Personel{

    protected int saatUcreti;
    public String statu;
    protected int maas;

    protected int massHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }




}
