package day47_linkedList;

import java.util.HashSet;
import java.util.Set;

public class C04_ArraydanTekrarlariSilme {

    public static void main(String[] args) {

        // verien bir arraydan tekrar eden elemetleri silip
        // unique elementler olusan bir array haline dondurun bir method olustrun

        Integer arr[]={3,5,1,2,6,1,7,8,9,3,5,7,6};
       arr= benzersizYap(arr);





    }

    private static Integer[] benzersizYap(Integer[] arr) {
      Set<Integer> benzersizSet=new HashSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index = 0;
        for (Integer each:benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;
        }

        return arrBenzersiz;
    }
}
