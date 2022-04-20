package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {

    public static void main(String[] args) {
// hem list hem de Queue nun child classidir
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10); // add listden geldiginden hep sona ekler
        list.addFirst(11); // addFisrt deque den gelir basa yazar
        list.addLast(12); // addLast deque den gelir sona yazar
        list.add(1, 9);
        System.out.println(list);


    }


}
