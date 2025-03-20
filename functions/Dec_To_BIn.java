public class Dec_To_BIn {

    static void Dec_To_BinFun(int decNum){
        int originalNum = decNum;
        int binNum = 0;
        int pow =0;
        while(decNum>0){
            int rem = decNum%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum  = decNum/2;

        }
        System.out.println("binary form of " + originalNum + " is = "+ binNum);
    }
    
    public static void main(String[] args) {
        // System.out.println("Hello world");

        Dec_To_BinFun(5);
    }
}
