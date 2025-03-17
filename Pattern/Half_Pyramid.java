// package pattern;



public class Half_Pyramid {

   static void halfPyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j =1; j<=i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        halfPyramid(4);
    }
}
