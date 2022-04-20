package day41_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 0;

        try {
          c = a/b;
        } catch (Exception e) {
            // burada yazdigimiz e : jaanin exception i atayacagimiz obje
            // exception ise olusan exception turu

            System.err.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println(c);


    }
}
