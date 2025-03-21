public class Linear_search {
 

    static int  LinearSearch(int numbers[], int key){
        for(int i =0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8};
        // [] is Only Used in Declaration
        //You can't use [] when passing an array as an argument.
        System.out.println(LinearSearch(numbers, 5));//no need of [] here in array 
    }
}






//    public static void main(String[] args) {
//     // System.out.println("hola");
//    }

