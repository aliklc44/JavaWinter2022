package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }

        if (a > 0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        //bir if cumlesinin daha anlasilir olmasini istiyosaniz suslu parantez icine yazmalisiniz
        //body suslu paranteze almazsak da calisir ancak ilk; gordugunde if cumlesi biter

        System.out.println("ikinci satirda calisti");
        //18 deki kod 14 deki falseda olsa true da olsa calisir



        }
    }
