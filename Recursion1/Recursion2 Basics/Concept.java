// package Recursion2 Basics;

public class Concept {

    // Infinite loop concept
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // fun(n--); this will cause infinite printing of 6.
        fun(--n);
    }

//n--

// fun(6) ➝ fun(6) ➝ fun(6) ➝ ...

    // --n
    /*
     * fun(6)
     * → prints 6
     * → fun(5)
     * → prints 5
     * → fun(4)
     * → ...
     * → fun(0) → base case → return
     * 
     */

    public static void main(String[] args) {
        fun(6);
    }
}
