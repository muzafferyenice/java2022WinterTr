package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev, 123");
        sinifList.put(102,"VAli, Can, Qa, 124");
        sinifList.put(103,"Veli, Yan, Dev, 111");
        sinifList.put(104,"eli, an, Java, 1232");
        sinifList.put(105,"deli, Yn, Java, 1212");

        return sinifList;
    }
}
