// package Recursion2 Basics;

public class Factorial {
    
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum(int n){
        if(n ==0 || n==1){
            return n;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
       int ans =  fact(6);
       System.out.println("Factorial is : "+ans);

       System.out.println("=============================");

       int ans2 = sum(29);
       System.out.println("Sum is: "+ans2);
    }
}
