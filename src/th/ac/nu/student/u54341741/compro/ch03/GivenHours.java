package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;

public class GivenHours {
    
    public static void main (String [] args){
        
      
       Scanner in = new Scanner(System.in);
        int Time1;
        int Time2;
        
        System.out.print("Enter hours is :");
        int hour = in.nextInt();
        
        System.out.print("Enter minute is :");
        int minute = in.nextInt();
    
   
        if(hour>minute){
            System.out.println("hour");
        }else if(hour==minute){
            System.out.println("minute : "+minute);
        }else{
            System.out.println("minute");
        }   
    } 
    
}
