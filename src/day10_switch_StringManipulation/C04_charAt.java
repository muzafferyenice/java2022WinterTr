package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        //String de herhangi bir karakteri almak istedigiizde o harfin indeksini kullanarak
        // str.chatAt(istenenIndex) yazabiliriz

        String str="Java Cok Guzel";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));//G yazdirir
        System.out.println(""+str.charAt(2)+str.charAt(3));// va yazar

        // cOK seklinde yazdir
        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
                ""+str.toUpperCase().charAt(7));







    }
}
