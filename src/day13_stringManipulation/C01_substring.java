package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str ="Java ile IT cok guzel ";

        System.out.println(str.substring(5));
        //java yerine mehmet hoca yazalim replace ile

        System.out.println(str.replace("Java" ," Mehmet Hoca"));

        System.out.println(" Mehmet Hoca " + str.substring(5) + "harbiden cok guzel");

        System.out.println(str.substring(9)); // yazilan index(9) inclusive dahil

        // Eger bir index'den sona kadar olan parcayi degil
        // belirli bir parvcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive/dahil
        // bitis indexi ==> eclusive/haric

        System.out.println(str.substring(5,6));

        // dikkat index 0 ama 1. harftir "java" da j 0. index ama 1.harf

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); // hiclik dondurur
        // System.out.println(str.substring(5,2)); // bitis index'i baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));  // son harfi verir

        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdiralim

        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir


    }
}
