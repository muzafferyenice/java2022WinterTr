package day46_iterator_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(58);
        liste.add(56);
        liste.add(55);
        liste.add(59);
//her elementi 3 arttir
        System.out.println("liste = " + liste);
        //listenin tum elementlerini bize getirmesi icin ite nin hasnext ve next methodlarini kullancaz
      //  Iterator itr=liste.iterator(); bunda iteratoru degistiremiyorsun

        ListIterator itr=liste.listIterator();//burdan olusturunca oluyor literatoru listten olusturun

        while(itr.hasNext()){//yaninda element oldugu surece gidicek

           Object sayi=itr.next();

            itr.set((Integer)sayi+3);



        }
        System.out.println(liste);

    }
}