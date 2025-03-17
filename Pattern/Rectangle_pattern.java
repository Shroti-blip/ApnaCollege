// package pattern;

public class Rectangle_pattern {

    static void Hollow_rectangle(int n, int m){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=m; col++){
                if(row == 1 || col == 1 || row == n || col ==m){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Hollow_rectangle(4, 5);
    }
}
