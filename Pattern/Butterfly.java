// package pattern;

public class Butterfly {
    

    public static void main(String[] args) {
        // System.out.println("Hola");
        int  n =5;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print('*');
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half

        for(int i = n-1; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print('*');
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
