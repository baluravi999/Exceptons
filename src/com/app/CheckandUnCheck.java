package com.app;

public class CheckandUnCheck {
  public static void main(String[] args) {
	

	System.out.println("stm1"); 
	System.out.println("stm2"); 
	System.out.println("stm3"); 
	System.out.println("stm4"); 
	//System.out.println(34/0); // UNCHECKED EXCEPTION(ArithmeticException)
	System.out.println("stm4"); 
	int[] x={10,30,40,45};
	System.out.println(x[0]);
	//System.out.println(x[8]);  //UNCHECKED EXCEPTION(ArrayIndexOutOfBoundsException)
	
	String str="ratan";
	
	//str.charAt(9);//  UNCHECKED EXCEPTION(StringIndexOutOfBoundsException)
	
	System.out.println("hi ratan");
	System.out.println("hi ratan");
	System.out.println("hi balaji");
	//Thread.sleep(3000); CHECKED EXCEPTIoN( InterruptedException)
	try{
		System.out.println("hi ratan");
	System.out.println(10/0);
	
	
	}//System.out.println("hi ravi");
	catch(Exception e){
		System.out.println("cath exicuted");
	}
	System.out.println("hi kishore");
	
	//System.out.println(10/0);
	
	
	
  }
	  
	  
  
  }
	
	

