public class Prefix_Sum {
    
    static int[] createSum(int[] arr){
        int n = arr.length;
        int[] prefixSUM = new int[n];
        prefixSUM[0]= arr[0];
        for(int i = 1; i<n; i++){
            prefixSUM [i]= prefixSUM[i-1]+ arr[i];

        }
        
        return prefixSUM;
    }

    public static void main(String[] args) {
        
        int arr[] = { 2, 4, 6, 8, 10 };
        int prefixSUM[] = createSum(arr);
        System.out.print("Prefix Sum Array: ");
        for (int sum : prefixSUM) {
            System.out.print(sum + " ");
        }
    }
}
