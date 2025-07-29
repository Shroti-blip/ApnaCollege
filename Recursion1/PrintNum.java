// package Recursion1;
public class PrintNum {
 
    static void print(){
        System.out.println(1);
        print2();
    }
     static void print2(){
        System.out.printf("Hola");
        System.out.println();
        print3();
     }
 static void print3(){
        System.out.println(3);
        print4();
    }
      static void print4(){
        System.out.printf("Hola2");
        System.out.println();
        print5();
     }
     static void print5(){
        System.out.println(4);
    }
    
    public static void main(String[] args) {
        print();
    }
}
