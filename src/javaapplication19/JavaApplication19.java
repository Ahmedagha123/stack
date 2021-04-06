
package javaapplication19;

import java.util.Scanner;


public class JavaApplication19 {

    
    public static void main(String[] args) {
 
 
        Scanner scan=new Scanner(System.in);
        int size;
          System.out.println("Enter numbers ");
        
        size = scan.nextInt();
        Stack s1=new Stack( size);
        
      
        for (int i=0;i<size;i++)
        {
             System.out.println("Enter numbers ");
            s1.Push(scan.nextInt());
        }
          for (int i=0;i<size;i++)
        {
            
            System.out.println("last number"+s1.pop());
        }








    }
    
}
