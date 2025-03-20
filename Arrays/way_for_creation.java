//  package Arrays;

import java.util.Scanner;

public class way_for_creation {
 
    
    public static void main(String[] args) {
        // System.out.println("hola");


        //syntax

        // dataType arrname[] = new dataType[size];

        int marks[] = new int[20];
        // int number[] = {1,2,3};
        // int morenum [] = {4,5,6};
        // String fruits[] = {"apple", "Mango", "orange"};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first marks : ");
        marks[0] = sc.nextInt();
        System.out.println("enter second marks : ");
        marks[1] = sc.nextInt();
        System.out.println("enter third marks : ");
        marks[2] = sc.nextInt();

        System.out.println("physics : " + marks[0]);
        System.out.println("chemistry : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        
    }
}
