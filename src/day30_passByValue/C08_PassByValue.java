package day30_passByValue;

import java.util.Arrays;

public class C08_PassByValue {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }


    private static void arrDegistir(int[] arr){
        arr=new int[5];
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
