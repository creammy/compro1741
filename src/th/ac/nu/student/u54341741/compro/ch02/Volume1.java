/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341741.compro.ch02;

/**
   This program computes the volume (in liters) of a six-pack of sola cans.  
 */
public class Volume1 {
    public static void main (String [] args){
        int cansPerPack = 6;
        double cansVolume = 0.355;// Liters in a 12-ounce can
        System.out.print("A six-pack of 12-ounce cans contains");
        System.out.print(cansPerPack * cansVolume);
        System.out.println(" liters. ");
    }
    
}
