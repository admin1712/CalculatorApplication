



public class CalculatorProgram {
	//int a=5;
          // int b=10;
	//Scanner s=new Scanner(System.in);
    public  static void addition()
    {
	     int  a=10;
	   int  b=20;
    	//System.out.println("Enter two numbers : ");
    	//a=s.nextInt();
    	//b=s.nextInt();
          

    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public static void subtraction()
    {
	   int  a=10;
	   int  b=20;
	    
      /*
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();
       */
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public static void multiplication()
    {
	     int  a=10;
	   int  b=20;
          /*
    	System.out.println("Enter two numbers : ");
    	a=s.nextInt();
    	b=s.nextInt();*/
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public static void division()
    {
	     int  a=10;
	   int  b=20;
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
    	//CalculatorProgram  c=new CalculatorProgram ();
        addition();
         subtraction();
         multiplication();
         division();
         
		
	}
}
