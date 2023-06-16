package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String []args) {
    int arr[] = {5,4,3,2,1};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped = false;
        //run the steps n-1 times
        for(int i = 0; i < arr.length;i++) {
            //for each pass max item will come at the last respective index
            swapped = false;
            for(int j = 1; j < arr.length-i;j++) {
                //Swap if the item is smaller than previous item
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

    }
}
