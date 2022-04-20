package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydanTekrarSil {
    //arrayda tekrarli lari sil yeni array olusur
    public static void main(String[] args) {
        Integer arr[] = {1, 1, 22, 22, 3, 3, 6, 5, 4, 8, 9, 8, 7, 77, 8, 8, 55};

        arr = benzersizYap(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet = new TreeSet<>(); //HashSet [1, 3, 4, 5, 22, 6, 7, 55, 8, 9, 77]
        for (Integer each : arr                       //TreeSet<>();[1, 3, 4, 5, 6, 7, 8, 9, 22, 55, 77]
        ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
       Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index = 0;
        for (Integer each : benzersizSet
        ) {
            arr[index] = each;
            index++;
        }
        return arrBenzersiz;
    }
}
