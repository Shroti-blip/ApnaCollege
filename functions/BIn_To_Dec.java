// package DSA.functions;

public class BIn_To_Dec {


    static void Bin_To_Decfun(int binNum){

        int originalNum = binNum;
        int decNum = 0;
        int power = 0;
        while(binNum>0){
          int lastD = binNum %10;
           decNum = decNum + (lastD *(int)Math.pow(2, power));
           power++;
           binNum = binNum/10;
     
        }

        System.out.println("Decimal number of "+ originalNum +" is = "+ decNum);
    }


    public static void main(String[] args) {
     
        Bin_To_Decfun(110);
    }
}
