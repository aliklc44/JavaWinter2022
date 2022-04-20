package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        // linkedListin 2 tane parent interface i  vardir
        //LinkedList olustururken data turu olarak
        // LinkedList secersek iki parenttaki methodlar
        // List seceersek sadece list interface indeki methodlar
        // deque queue Deque deki methodlar

         LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);

        // sadece list interface inden ozellik kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(5);
        ll2.remove(0);

        // sadece deque den gelen ozellikleri kullanalim
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addFirst(10);
        ll3.addLast(12);
        System.out.println(ll3);





    }
}
