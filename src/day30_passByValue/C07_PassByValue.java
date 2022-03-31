package day30_passByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {
        /* non primitive data turlerinde objenin kendisi degil de icindeki elemetler degisirse
        java objenin referansi ve objenin kenmdisi degismedigi icn element
        degisikligini kabul eder ve kalici yapar

         */

        int arr[]={1,2,3};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        arrDegistir(arr);
        
        
        
    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));


    }
}
