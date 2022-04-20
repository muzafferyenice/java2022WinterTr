package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10);
        ll1.addLast(20);
        System.out.println(ll1);
        System.out.println("ll1.element() = " + ll1.element());//ilk elementi verir

        ll1.offer(30);
        System.out.println(ll1);

    }
}
