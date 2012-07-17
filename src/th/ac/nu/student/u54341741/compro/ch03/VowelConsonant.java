package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;

public class VowelConsonant {
   public static void main(String [] args){
       
       Scanner in = new Scanner(System.in);
       boolean vowel = false;
        System.out.print("Enter a single character :");
        String C = in.nextLine();
        char alphabet = C.charAt(0);
        
        switch(alphabet){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
            break;
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");    
            break;  
            default:
            System.out.println("Error");
            break;
            }      
            }   
   }

    
    

