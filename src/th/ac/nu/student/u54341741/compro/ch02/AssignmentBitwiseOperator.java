/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
 *
 * @author GHz
 */
public class AssignmentBitwiseOperator {
    
    public static void main(String[] args) {

        int x = 7;

        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));
        x = 7;
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));
    }    
}
