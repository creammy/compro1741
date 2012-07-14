/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
 *
 * @author GHz
 */
public class RoundoffDemo {
    public static void main (String [] args){
    double price = 4.35;
    int cents = (int)(100*price);  // Should be 100*4.35 = 435
    System.out.println(cents);     // 434!
    System.out.println("cents :"+ Math.round(100*price)); // 435
    }
    
}
