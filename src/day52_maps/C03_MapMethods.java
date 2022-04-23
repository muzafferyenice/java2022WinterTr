package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethods {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);

        myMap.putIfAbsent("A", 6);
        System.out.println("myMap.putIfAbsent(\"A\",6) = " + myMap.putIfAbsent("A", 6));
        if (myMap.putIfAbsent("K", 20) != null) {
            System.out.println("girdigin var");
        }

        System.out.println("myMap = " + myMap);
        myMap.put("A", 10);
        System.out.println(myMap);

        myMap.computeIfAbsent("A",b ->20);
        System.out.println(myMap);

        myMap.compute("A",(key,value)->20);
        System.out.println(myMap);

        myMap.compute("H",(key,value)->(2*value+5));
        System.out.println(myMap);


    }
}
