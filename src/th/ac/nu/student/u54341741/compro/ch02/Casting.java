/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
 *
 * @author GHz
 */
public class Casting {
    
    public static void main(String[] args) {
        double d = 257.234;
        int i = (int) d;
        System.out.println(i); // 257
        byte b = (byte) d;
        System.out.println(b); // 1 (257%256)
        }
}
