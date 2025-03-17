// package pattern;

public class character_pyramid {
    // char ch = 'A'; // cant access from here cause its a instance variable and static methods cant access not static variable directly.
    static void Character_pyramid(int n){
        char ch = 'A';// so declare inside method.
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Character_pyramid(4);
    }
}
