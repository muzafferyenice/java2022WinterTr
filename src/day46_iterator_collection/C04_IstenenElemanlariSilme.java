package day46_iterator_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlariSilme {
    public static void main(String[] args) {
        /*
        liste olustur bu listede istenen sayi araliginda omayan elementleri sile bir program yaz
        20den buyuk 40 dan kucuk
         */

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        ListIterator itr = liste.listIterator();
        while (itr.hasNext()) {

            Object sayi=itr.next();
            if((Integer)sayi<=20 || (Integer)sayi>=40){
                itr.remove();
            }
        }
        System.out.println(liste);
    }
}
