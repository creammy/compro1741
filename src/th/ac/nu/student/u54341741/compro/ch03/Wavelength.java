package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;

public class Wavelength {
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Wavelength :");
        double Wavelength = in.nextDouble();
         
        if(Wavelength>Math.pow(10,-1)){
            System.out.println("Radio Waves");
        }else if(Wavelength<=Math.pow(10,-1)){
            System.out.println("Microwaves");
        }else if(Wavelength<=Math.pow(10,-3)){
            System.out.println("Infared");
        }else if(Wavelength<=Math.pow(10,-7)*7){
            System.out.println("Visible light");
        }else if(Wavelength<=Math.pow(10,-7)*4){
            System.out.println("Ultraviolet");
        }else if(Wavelength<=Math.pow(10,-8)){
            System.out.println("X-rays");
        }else{
            System.out.println("Grammar rays");
        }
    }  
}
