// package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort2 {

    static void bubble_sort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0 ; i<n; i++){
            for(int j = 1 ; j<n-i; j++){
                if(arr[j]<arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=swap;

                    swapped = true;
                }
            }
            if(!swapped)
            {break;}
        }
    }
    

    public static void main(String[] args) {
        
        int arr[] = {3,5,2,4,1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
        }
}
