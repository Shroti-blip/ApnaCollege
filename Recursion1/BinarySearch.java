// package Recursion1;

public class BinarySearch {
    static int search(int arr[] , int target , int s , int e){
        if(s>=e){
            return -1;
        }
        int m = s +(e-s)/2;
            if(arr[m] == target){
                return m;
            }
            if(arr[m] <= target){
                return search(arr, target, m+1, e);
            }
            else{
                return search(arr, target, s, e-1);
            }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9,22,33,44};
        int target = 7;
        int s =0;
        int e = arr.length;
        int result = search(arr , target , s , e);
        System.err.println("Target Exist at : " + result + " index.");
    }
}
