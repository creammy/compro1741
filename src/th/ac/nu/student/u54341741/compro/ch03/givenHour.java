package th.ac.nu.student.u54341741.compro.ch03;

import java.util.Scanner;

public class givenHour {
    public static void main(String[] args){
        
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the first military time : ");
       String input1 = in.next();
       int time1 = Integer.parseInt(input1);
       System.out.print("Enter the second military time : ");
       String input2 = in.next();
       int time2 = Integer.parseInt(input2);
       
       if(time1<time2){
           System.out.println("The time is that comes first is :"+time1);
       }else if(time1==time2){
           System.out.println("The time are that same is :" + time1 +","+ time2);
       }else{
           System.out.println("The time is that comes first is :"+time2);      
       }
    }
}