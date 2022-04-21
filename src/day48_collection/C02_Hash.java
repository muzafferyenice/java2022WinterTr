package day48_collection;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str ="Java cok guxel";
        System.out.println("str.hashCode() = " + str.hashCode());//-481589966

        Set<Integer> sayiKume=new HashSet<>();
        System.out.println("sayiKume.hashCode() = " + sayiKume.hashCode());//0
        sayiKume.add(10);
        System.out.println("sayiKume.hashCode() = " + sayiKume.hashCode());// 10
        sayiKume.add(20);
        System.out.println("sayiKume.hashCode() = " + sayiKume.hashCode());//30




    }
}
