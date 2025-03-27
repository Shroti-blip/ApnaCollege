public class Kadanes_algo {
    
    // This way, we don’t need two loops because:

    // Instead of checking all subarrays explicitly, we just keep extending the best subarray found so far.
    
    // If extending the current subarray leads to a negative sum, we restart the sum from the next index.





    public static void main(String[] args) {
       int  nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0; int maxSum = Integer.MIN_VALUE;
        for(int val:nums){
            currSum += val;
            maxSum = Math.max(currSum, maxSum);
            if(currSum <0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
