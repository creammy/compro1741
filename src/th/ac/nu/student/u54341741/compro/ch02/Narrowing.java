/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
 *
 * @author GHz
 */
public class Narrowing {
    
    public static void main(String[] args) {
        int i = 32768;
        short s = (short) i;
        System.out.println("i = " + i + ", s = " + s); // i = 32768, s = -32768
        }
}
