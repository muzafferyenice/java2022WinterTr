package day46_iterator_collection;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);//add hep sona ekler
        list.addFirst(11);// basa ekler
        list.addLast(12);//sona ekler daha hizli calisir
        System.out.println(list);
        list.add(2, 15);
        System.out.println(list);
    }
}
