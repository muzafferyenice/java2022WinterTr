package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer>ll1=new LinkedList<>();
        ll1.add(10);

        //sadece list interface den ozellikler kullanmak istrsek
        List<Integer>ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        //sadece deque den gelen ozelllikelr i kullanalim
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);


    }
}
