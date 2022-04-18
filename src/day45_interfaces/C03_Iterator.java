package day45_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(58);
        liste.add(56);
        liste.add(55);
        liste.add(59);

        System.out.println("liste = " + liste);
        //for each kullanarak her elementi iki artirin
        for (Integer each:liste){
            each=each+2;
        }
        System.out.println(liste);

        Iterator itr=liste.iterator();



    }
}
