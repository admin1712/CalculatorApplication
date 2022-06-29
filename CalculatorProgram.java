package javaCal;

import java.util.Scanner;

public class Calculator {
	int a,b;
	Scanner s=new Scanner(System.in);
    public void addition()
    {
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public void subtraction()
    {
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public void multiplication()
    {
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public void division()
    {
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
    	System.out.println("Quotiont of Numbers : "+(a/b));
    	System.out.println("Remender of numbers : "+(a%b));
    }
	 public void percentage()
    {
    	System.out.println("Enter two marks : ");
		System.out.println("Enter two Total marks : ");
		
    	int marks=s.nextInt();
    	int total=s.nextInt();
    	System.out.println("percnetage  : "+((marks/total)*100));
    	
    }
	
	 public void Power(int x,int y)
  {
	  
	    	int res=1;
	    	while(x!=0)
	    	{
	    		res=res * y;
	    		--x;
	    	}
	    	System.out.println(" power of number = "+res);
	    	
	
	  
  }
   public static double squareRoot()   
	{  
	  System.out.println("Enter square number  : ");
	  Scanner s=new Scanner(System.in);
	  int num=s.nextInt();
		double t;  //temporary variable 
		double sqrtroot=num/2;  
		do   
		{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
			System.out.println(sqrtroot);  
	}  
	
    
    public static void main(String[] args) {
    	int choice ;
    	Calculator c=new Calculator();
    	Scanner s1=new Scanner(System.in);
		do {
			System.out.println("1 . for addition");
			System.out.println("2 . for subtraction");
			System.out.println("3 . for multiplication");
			System.out.println("4 . for division");
			System.out.println("5 . for percentage");
			System.out.println("6 .  for power");
			System.out.println("7 .  for Squareroot");
			System.out.println("Enter choice for operations : ");
			choice=s1.nextInt();
		 switch(choice)
		 {
		 case 1:
			c.addition();
			System.out.println("__________________________________________________________________________");
			break;
		 case 2:
			 c.subtraction();
			 System.out.println("__________________________________________________________________________");
			 break;
		 case 3:
			 c.multiplication();
			 System.out.println("__________________________________________________________________________");
			 break;
			 
		 case 4:
			 c.division();
			 System.out.println("__________________________________________________________________________");
			 break;
		 case 5:
		     c.percentage();
			  System.out.println("__________________________________________________________________________");
			 break;
		  case 6:
		    c.power();
			 System.out.println("__________________________________________________________________________");
			 break;
			
		  break;
		  case 7:
		     c.sqrtroot();
			  System.out.println("__________________________________________________________________________");
			  
			break;
			 
		 }
		
		}while(choice !=8);
	}
}