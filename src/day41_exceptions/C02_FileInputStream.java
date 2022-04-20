package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {

    public static void main(String[] args)  {
        /*
        bir kod yazilirken olasi exceptions on gorulup
        exception olusturgunda javanin ne yapmasini istedigimiz
        belirtilmelidir

        1- eger ecteption olustugunda kodun calismaya devam etmesini istemiyorsak
           method isminin yanina bunu declare edebiliriz
        2- eger exception olussada kodun devam etmesini istiyorsak
           sorun olusturabilecek kodu try catch blogunun icine alir
           try bloguna sorun cikabilecek kodu
           catch bloguna olusabilecek exceptioni
           ve olasi exception durumunda javanin ne yapmasi
           istedigini yazabilriz
         */

        String dosyaYolu = "src/day41_exceptions/dosya";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
