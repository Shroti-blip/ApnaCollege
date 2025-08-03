// package Recursion2 Basics;

public class SumOfDigit {
    
    static int sum(int n){
        if(n==0){
            return n;
        }
        int rem = n%10;
        return rem + sum(n/10);
    }

    static int product(int n){
        if(n==0){
            return 1;
        }
         int rem = n%10;
        return rem * product(n/10);
    }
    public static void main(String[] args) {
        int n = 1534;
       int res =  sum(n);
       System.out.println(res);
        System.out.println("=====================");
       int p = product(n);
       System.out.println(p);
    }
}
