import java.util.*;
public class Odd_Even {
    
    public static void check(int n){
        if(n%2 ==0){
            System.out.println( n+" number  is an even number");
        }
        else{
            System.out.println(n + " number is odd");
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value here");
        int n = sc.nextInt();

        check(n);

    }
}
