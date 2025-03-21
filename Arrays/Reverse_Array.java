public class Reverse_Array {
    
    static void reverse_array(int numbers[]){// just modifying the given array so dont need to return int.
        int n =(numbers.length)/2;
        for(int i = 0 ; i<n; i++){
            // code for swaping 
            int swap = numbers[i];
            // numbers[i] = numbers[n-1];// n-1 nhi hoga kyunki n to half length se chal rha tha
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = swap;
            
        }
        return ;
    }

    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        // int answer = reverse_array(numbers);
        // System.out.println(answer);
        // System.out.println(reverse_array(numbers));

        reverse_array(numbers);
        for(int num : numbers){
            System.out.println(num + " ");
        }


    }
}
