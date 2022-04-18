package day46_iterator_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(58);
        liste.add(56);
        liste.add(55);
        liste.add(59);

        System.out.println("liste = " + liste);
        Iterator itr= liste.iterator();

        System.out.println("itr.hasNext() = " + itr.hasNext());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        itr.remove();
        System.out.println("liste = " + liste);


    }
}
