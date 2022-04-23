package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;

public class EntrySet {

    public static void main(String[] args) {


        Map<Integer,String>sinifListMap= MapOlustur.myMap();

        System.out.println(sinifListMap);

        System.out.println(sinifListMap.entrySet());

    }
}
