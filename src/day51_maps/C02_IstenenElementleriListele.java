package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

import static java.lang.Integer.parseInt;

public class C02_IstenenElementleriListele {
    /*
    Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri
    list olarak donduren bir method yaziniz.
    map {    101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil  java
    Sonuc  [Ali, Veli]
     */
    public static void main(String[] args) {
        Map<Integer, String> sinifMap = MapOlustur.myMap();
        String istenenDil = "Java";
        List<String> istenenDiliBilenlerListesi = istenenDiliBilenlerListesilustur(sinifMap, istenenDil);
        System.out.println("istenenDiliBilenlerListesi = " + istenenDiliBilenlerListesi);

    }

    public static List<String> istenenDiliBilenlerListesilustur(Map<Integer, String> sinifMap, String istenenDil) {
        List<String> istenenDiliBilenlerListesi = new ArrayList<>();
        Collection<String> sinifValue = sinifMap.values();
        List<String> listValue = new ArrayList<>();
        listValue.addAll(sinifValue);
        int outerArrayBoyut = listValue.size();
        String ilkValue = listValue.get(0);
        String ilkValueArr[] = ilkValue.split(", ");
        int innerArrBoyut = ilkValueArr.length;

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = listValue.get(i).split(", ");
            for (int j = 0; j < innerArrBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));
        for (int i = 0; i < outerArrayBoyut; i++) {
            if (valueMDArr[i][2].equals(istenenDil)) {
                int input= parseInt(valueMDArr[i][3]);
                //input+=parseInt(valueMDArr[i][3]);;
                //System.out.println(input);
                istenenDiliBilenlerListesi.add(String.valueOf(parseInt(valueMDArr[i][3])+input));
                istenenDiliBilenlerListesi.add(valueMDArr[i][3]);
            }
        }
        return istenenDiliBilenlerListesi;
    }
}
