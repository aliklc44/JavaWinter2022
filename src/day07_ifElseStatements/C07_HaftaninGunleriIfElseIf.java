package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yazınız");
        String gunIsmi= scan.next().toLowerCase();
        //hatali girisleride yazdirmak icin olasılıklari 3 e cikardim
        //hafta ici hafta sonu ya da yanlis giris

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){

            System.out.println("girdiginiz gun hafta sonu");

        }else if(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba")||gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){

            System.out.println("girdiginiz gun hafta ici");

        }else{
            System.out.println("lutfen gecerli bir gun ismi giriniz");

        }

        //eger if else if ..... stattement ta else ile bitiyorsa olasılıklardan sadece
        // bir tanesi mutlaka calisir
        //java ilk buldugu true ait sonucu yazdirir ve kalan sartlara bakmaz

        //if else if cumleleri else ile bitmesede calisir
        //ancak bu durumda sadece bir olasilik calisa bilir
        // veya hic bir islem yapilmaya bilir



    }
}
