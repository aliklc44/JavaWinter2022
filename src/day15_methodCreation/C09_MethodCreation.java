package day15_methodCreation;

public class C09_MethodCreation {

    public static void main(String[] args) {

        String isim = "sueda";
        String soyIsim = "YUREGIL";
        String kKNo = "1234567890123456";


        // eger bir method dan bir islem yapmasini ve yaptigi islemi ize getirmesini isterseniz
        // return type void degil bbize getirecegi sonucun data turunde olmalidir
       String gizlenmisIsimSoyisim= isimSoyisimGizle(isim, soyIsim);
        // bana isim ve soyisim gizlenmis halinde getirmesini istiyorum
        // bekledigim donus String olur
        System.out.println(gizlenmisIsimSoyisim);
       String gizlenmisKKNo= krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);


    }

    public static String krediKartiGizle(String kKNo) {
        String yenikKNo = "**** **** **** " + kKNo.substring(12);
        return yenikKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyIsim) {
        String yeniIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll
                ("\\S", "*");
        // method olusturmada 3. adim method calisinca sadece bir sey mi yazdiracak
        // yoksa bir data mi gonderecek buna karar vermektir
        // bu soruda gizlenmis isim soyisim gondermesi istendiginden return type oid degil string sectik
        // methodun sonuna return edilecek datayi yazdik
        return yeniIsim+" "+yeniSoyIsim;
    }
}
