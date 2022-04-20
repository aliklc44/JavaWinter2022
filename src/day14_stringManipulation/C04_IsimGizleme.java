package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

  //     Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
  //      isim-soyisim : M***** B*******
  //      kart no : **** **** **** 1234

        String isim = "sueda";
        String soyIsim = "YUREGIL";
        String kKNo = "1234567890123456";

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                          isim.substring(1).replaceAll("\\S","*");

        String yeniSoyIsim = soyIsim.substring(0,1).toUpperCase()+
                             soyIsim.substring(1).replaceAll("\\S","*");

        String yenikKNo = "**** **** **** " + kKNo.substring(12);

        System.out.println("isim-soyisim : " + yeniIsim+" "+yeniSoyIsim+
                "\nkart no : "+yenikKNo);

    }
}
