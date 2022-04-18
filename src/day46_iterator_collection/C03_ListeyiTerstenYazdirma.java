package day46_iterator_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
//verilen listeyi tersten yazdir iterator ile
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(58);
        liste.add(56);
        liste.add(55);
        liste.add(59);
//once iteratoru olusturup sona yollayaim
        ListIterator<Integer> itr = liste.listIterator();
        while (itr.hasNext()) {
            itr.next();
        }
while (itr.hasPrevious()) {
    System.out.print(itr.previous()+" ");
}
    }
}