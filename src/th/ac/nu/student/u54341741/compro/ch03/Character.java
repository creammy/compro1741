package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;
public class Character {
    public static void main (String [] args) {
        
       
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a single character :");
        String C = in.nextLine();
        char ch = C.charAt(0);
        
        
        if(ch=='a'&&ch<='z'){
        System.out.print("Consonant");
        //}else if(ch=='ก'&&ch<='ฮ'){
        System.out.print("Consonant");
        }
        else{
            System.out.print("Error message");
            
            
       
        }
        }
        
    }
    

