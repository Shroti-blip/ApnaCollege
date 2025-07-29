// package Recursion1;
public class Message2 {
    
      static void msg(){
        System.out.println("Hola Amiga!!");
        msg2();
    }
    static void msg2(){
        System.out.println("Hola Amiga2");
        msg3();
    }
    static void msg3(){
        System.out.println("HOla Amiga3");
        msg4();
    }
    static void msg4(){
       System.out.println("Hola Amiga4");
        msg5();
    }
    static void msg5(){
        System.out.println("Hola Amiga5");
    }



    public static void main(String[] args) {
        // System.out.println("hola");
        msg();
    }
}
