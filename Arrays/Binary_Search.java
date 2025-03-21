public class Binary_Search {
    

    static int binary_Search(int numbers[], int key){
        int start = 0; 
        int end = numbers.length-1;
        int mid = (start + end)/2;
        while(start<=end){
 
        if(numbers[mid]==key){
            return mid;
        }
        else if(numbers[mid]<mid){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        
    }         
    return -1;  
}


    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,12};
       System.err.println( binary_Search(numbers , 5));
    }
}
