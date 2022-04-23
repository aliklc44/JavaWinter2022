package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        // sınıftaki ögrenci listesini duzenli olarak yazdıralım

        Map<Integer,String> sinifListMap=MapOlustur.myMap();
        System.out.println(sinifListMap);
         /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySeti=sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);

        System.out.println(keyList.get(2));

        // Simdi de value leri index ile ulasacagimiz bir sekle sokalim

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String>sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList); //  [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        /* herbir value birden fazla bilgiyi içeriyor
        onun için value leri multidimemsional bir Array a atmakmantıklı
        ancak multıdimensional olusturmak için boyutlarıbilmeye ihtiyac var
         */

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner Arraylerin boyutunu bulmak birazdaha kompleks
        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray []= ilkValue.split(", ");
        int innerArrayBoyutu = ilkValueArray.length;

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyutu];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyutu; j++) {

                valueMDArr[i][j]= temp[j];
            }
        }
        // bu satıra kadar key leri index ile ulaşabildiğim keyList e atadık
        // value leri valueMDArr e atadık
        // simdi bu key ve valueleri istediğimiz gibi manipule edebiliriz

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "     ");
            for (int j = 0; j < innerArrayBoyutu; j++) {
                System.out.print(valueMDArr[i][j] + "     ");
            }
            System.out.println("");
        }

    }
}
