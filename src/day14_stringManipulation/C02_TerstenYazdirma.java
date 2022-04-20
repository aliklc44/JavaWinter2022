package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin.

        String input = "mavi";

        String tersStr = input.substring(3) +
                input.substring(2,3) +
                input.substring(1,2) +
                input.substring(0,1);

        System.out.println(tersStr);
    }
}
