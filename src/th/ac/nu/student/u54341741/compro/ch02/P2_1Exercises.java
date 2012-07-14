package th.ac.nu.student.u54341741.compro.ch02;

import java.util.Scanner;

/**
 This program reads a number and display the square,cube,and fourth power.
 */
public class P2_1Exercises {
    public static void main (String []args){
        
        double Number ;
       
        Scanner in = new Scanner(System.in);
        System.out.print("Please in out number : ");
        Number = in.nextDouble();
 
        System.out.println("Square power is : " + Math.pow(Number ,2));
        System.out.println("Cube   power is : " + Math.pow(Number ,3));
        System.out.println("Fourth power is : " + Math.pow(Number, 4));
    }  
}
