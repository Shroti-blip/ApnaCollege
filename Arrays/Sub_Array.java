public class Sub_Array {
    
    static int sub_Array_Print(int numbers[]){
        int count = 0;
        for(int i =0; i<numbers.length; i++){
            for(int j =i; j<numbers.length; j++){
                System.out.print("("+ numbers[i] + ","+numbers[j]+")");
                count++;
            }
            System.out.println(count);
            // return i;// no use of return here cause its inside outter loop , it will terminate fn.
        }
        System.out.println(count);
        return -1;
        
    }

    public static void main(String[] args) {
      int  numbers[] = {1,2,3,4,5,6,7,89,43};
      sub_Array_Print(numbers);
      System.out.println();
    //   int pair =  sub_Array_Print(numbers);// void cant be converted to int ---so direct print fn.
        // System.out.println(pair);

       
    }
}
