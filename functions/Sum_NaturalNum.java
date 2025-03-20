public class Sum_NaturalNum {
    
    static void sum(int n){
    int sum =0;

       for(int i =0; i<=n; i++){
        sum += i;
       }
       System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(100);
    }
}
