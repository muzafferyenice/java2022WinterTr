package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        //Java Candir yazdir
        System.out.println(str1+" " + str2);

        String cumle=str1.concat(str2);
        System.out.println(cumle);
        cumle= str1.concat(" ").concat(str2);
        System.out.println(cumle);

        //concat icine boolean deger yazalim
        //cumle=str1.concat(5); kabul etmedi
        //cumle=str1.concat(true); kabul etmedi

        cumle =str1.concat(""+5); //cift tirnaka al kabul eder
        cumle=str1.concat(""+true); // cift tırnakta kabul eder







    }
}
