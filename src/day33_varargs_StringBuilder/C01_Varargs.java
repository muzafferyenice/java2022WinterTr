package day33_varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        String str1=" Ali";
        String str2=" Veli";
        String str3=" Oguzhan";
        //Yazilan argument sayisi sabitse herzaman ki gibi bir method olusturabiliriz
        //ancak argument sayisinin degisme ihtimali varsa
        //o zman varargs tercih edilir

        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr ="";

        for (String each:str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("enUzunStr = " + enUzunStr);
    }
}
