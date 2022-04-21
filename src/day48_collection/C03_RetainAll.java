package day48_collection;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {

    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        set1.add(11);
        set1.add(13);
        set2.addAll(set1);
        set2.add(13);// var olani iki yapmaz
        set2.add(15);
        System.out.println("set2 = " + set2);
        System.out.println("set2.retainAll(set1) = " + set2.retainAll(set1));//set2 gir set1 disindaki hepsini sil
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);


    }
}
