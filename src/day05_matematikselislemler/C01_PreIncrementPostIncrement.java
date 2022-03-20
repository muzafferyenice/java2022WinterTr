package day05_matematikselislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        sayi++;

        System.out.println(sayi);//11
        sayi++;
        System.out.println("pre-incrementten once"+sayi); // 12

        System.out.println("pre-increment satirinda"+ ++sayi); // once arttırır sonra  yazdirir
        System.out.println("pre-incrementten sonra" +sayi);//13

        System.out.println("post-increment satirinda" + sayi++); // 13 yazdir sonra yazdir
        System.out.println("post increment satirindan sonra" + sayi);//14

    }
}
