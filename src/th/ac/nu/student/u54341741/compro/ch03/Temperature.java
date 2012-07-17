package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;

public class Temperature {
    
    public static void main (String [] args){
        double C;
        double F;
        
        System.out.println("The temperature");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        C = in.nextDouble();
        F = (C*1.8)+32;
        System.out.println("The temperature in Fahrenheit is: "+F);
        
        System.out.print("Enter temperature in fahrenheit: ");
        F = in.nextDouble(); 
        C = (F-32)/1.8;
        System.out.println("The temperature in Celsius is: "+C);
        
        System.out.println("**********************************************");
        System.out.print("Weather water is : ");
        
       if(C<0&&F<32){
           System.out.println("Liquid");
 
       }else if(C>100&&F>212){
           System.out.println("Solid");
           
       }else{ 
           System.out.println("Gaseous");
               
        }
        }
    }
    

