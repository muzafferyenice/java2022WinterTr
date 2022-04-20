package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();
        System.out.println("ll1.peek() = " + ll1.peek());
        System.out.println("ll1.poll() = " + ll1.poll());

        // System.out.println("ll1.pop() = " + ll1.pop());//ilki silip dondurur ilk elementiu bulamazsexeption filratir
        ll1.push(10);


    }
}
