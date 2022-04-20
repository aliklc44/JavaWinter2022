package day46_iterator_collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        Iterator itr = liste.iterator();// iterator methodu olusturdugumuz liste objesi
                                        // uzerinden ArrayList classindan calistiriyoruz

        /*
        iterator nasil calisir
        bit iterator objesi olsuturmak icin collection uyesi bir obje kullanmaliyiz
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde calismak
        icin olustrmus olduk
        biz iterator objesini olusturdugumuzda
        iterator collectionin ilk elementinin oncesine gidip bekler

        itr.hasNext() ===> true iteratora yaninda eleman var mi diye sorar

        itr.next() ===> iterator bir sonraki elementin yanina gecer ve uzerinden gectigi
                        elementi bize dondurur

        itr.remove(); ===> iteratorin elindeki olan elementi sildi

         */


        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        System.out.println(itr.next()); // 8
        itr.remove(); // [5, 7, 6, 9]
        System.out.println(liste);
    }
}
