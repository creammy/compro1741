/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;
import java.util.Scanner;
/**
 *
 * @author GHz
 */
public class MathLibraryExample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
    System.out.print("Enter Number    :");
    int i = in.nextInt();
    System.out.print("Enter Number    :");
    int x = in.nextInt();
    
  
     System.out.println("min(" + i + "," + x + ") is " + Math.min(i,x)); 
     System.out.println("max(" + i + "," + x + ") is " + Math.max(i,x)); 
     
    } 
}
