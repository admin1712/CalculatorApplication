package javaCal;

import java.util.Scanner;

public class CalculatorProgram {
	int a=5;
           int b=10;
	//Scanner s=new Scanner(System.in);
    public void addition()
    {
    	//System.out.println("Enter two numbers : ");
    	//a=s.nextInt();
    	//b=s.nextInt();
            a=5;
           b=10;

    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public void subtraction()
    {
      /*
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
       */
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public void multiplication()
    {
          /*
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();*/
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public void division()
    {
      /*
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
       */
    	System.out.println("Quotiont of Numbers : "+(a/b));
    	System.out.println("Remender of numbers : "+(a%b));
    }
	

    
    public static void main(String[] args) {
    	int choice ;
    	CalculatorProgram  c=new CalculatorProgram ();
    	c.addition();
         c.subtraction();
         c.multiplication();
         c.division();
         
		
	}
}