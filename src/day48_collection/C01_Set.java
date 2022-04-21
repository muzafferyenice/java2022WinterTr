package day48_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C01_Set {
    public static void main(String[] args) {
        Integer arr[] = {1, 1, 22, 22, 3, 3, 6, 5, 4, 8, 9, 8, 7, 77, 8, 8, 55};
        arrayiTekrarsizYazdir(arr);



    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer>tekrarsizElement =new TreeSet<>();
        for (Integer each:arr) {
            tekrarsizElement.add(each);


        }

        System.out.println(tekrarsizElement);
    }


}
