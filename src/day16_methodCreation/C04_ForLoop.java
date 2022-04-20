package day16_methodCreation;

public class C04_ForLoop {

    public static void main(String[] args) {
        // erilen string i tersten yazdiran bir code yazdirin

        String str = "valla bu Java cok zevkli";
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }
}
