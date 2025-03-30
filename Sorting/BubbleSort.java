// package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){

            for(int j = 1; j < n-i; j++){

                if(arr[j]<arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=swap;
                }
            }

        }
    }


    public static void main(String[] args) {
        
        int arr[] = {3,1,5,4,2};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(c);

    }
}
