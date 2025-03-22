public class Sub_Array_Sum {

  public static int subarray_Sum(int numbers[]) {
    int max = 0;

    for (int i = 0; i < numbers.length; i++) {
      int c = 0;
      for (int j = i; j < numbers.length; j++) {
        System.out.print("{"+numbers[j]+"}");
        c +=numbers[j];
        if (c > max) {
          max = c;
        }

        // System.out.println("("+numbers[i] +","+ numbers[j]+")");//logic wrong for pair sum too.------------------------------------//dumboo
        // c += numbers[i] + numbers[j];//wrong logic.
        // if (c > max) {
        //   max = c;
        // }
        // System.out.println(c);
      }
      System.out.println();
     
    }
    // return -1;// instead of -1 return max.
    return max;
  }

  public static void main(String[] args) {
    int numbers[] = { 1, 2, 3 };
    System.out.println("max subarray sum is: " + subarray_Sum(numbers) );
    
    // System.out.println(subarray_Sum(numbers));
    // System.out.println(c);
  }
}
