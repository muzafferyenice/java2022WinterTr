package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{


    public static void main(String[] args) {//extends yappsan da final i degistiremzsin

        System.out.println(C01_Final.okulIsmi);
       // C01_Final.okulIsmi="asas"; final a deger atamasi yapamaz

    }
/*
    public static  void method1() {
        System.out.println("Parent class final method1");
        {
override parent class daki  methodu child classa uyarlamak istiyoruz
yani islevini degistirmek istiyruz
paaretnt daki final old icin degismez
        }
    }

*/
}
