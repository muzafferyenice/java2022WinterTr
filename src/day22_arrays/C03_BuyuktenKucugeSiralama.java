package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);

    }

    public static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr);

        int tersArr[]=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]=arr[arr.length-1-i];


        }
        System.out.println(Arrays.toString(tersArr));

    }

}

