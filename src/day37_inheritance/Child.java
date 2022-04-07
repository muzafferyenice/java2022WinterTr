package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {
    /* bir class i child class yaptigimizda parent class daki cons a ulasmasi
    gerekir. bu durumda parent class daki cons un access modifier i uygyn bir
    modifier yapilmalidir

    */
    Child(){
        super();
        System.out.println("child class pm siz cons");
    }
    Child(int s){
        // super(); bu burada her halikarda var
        // child class da tum cons larin ilk satirina java nin yerlestirdigi
        //        cons pm siz dir yani super cons tur
        System.out.println("child class pm li con calisti");
    }
    Child (int sayi1, int sayi2){
        //eger parent class dan pm siz cons u degil de baska bir cons u
        //calistirmak isterseniz bunu child class daki cons un ilk
        //satirina yazmalisin
        super(sayi1,sayi2);
        System.out.println("iki pm li cons");
    }
    public static void main(String[] args) {
        Child child = new Child(5,8);
    }
}
