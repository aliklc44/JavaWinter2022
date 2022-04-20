package day05_matematikselislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("pre-incrementten once " + sayi);
        //eger 8 ve 9. satirda islemi tek satirde yaparsam java 2 islemden once hangisini yapacagını bilmek ister
        //once arttırır sonra yazdırırsak java yeni degeri yazdırır ama once yazdırır sora arttırrıssak bu durumda
        //eski deger yazdırılır

        System.out.println("pre-increment satirinda " +  ++sayi);//once arttir sonra yazdır
        System.out.println("pre-incrementde sonra " + sayi);

        System.out.println("post-increment satirinda " + sayi++);//13 once yazdır sonra arttır
        System.out.println("post-increment satırından sonra " + sayi);//14






    }
}
