/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
 *
 * @author GHz
 */
public class MaximumValue {
    public static void main (String [] args){
        int num = 2147483647;
        System.out.println(num); //2147483647
        System.out.println(num+1); //-2147483648
        int num2= -2147483648;
        System.out.println(num2); //-2147483648
        System.out.println(num2-1); //2147483647
    }
    
}
