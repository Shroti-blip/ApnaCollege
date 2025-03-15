// package pattern;

public class InvertedStar {

    static void Inverted_Star(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i+1); j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Inverted_Star(5);
    }
}
