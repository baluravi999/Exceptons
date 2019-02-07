package com.app;

public class ExceptionCheck {

	public static void main(String[] args) {
		try   { 
			System.out.println(10/0);   
		System.out.println("ratan".charAt(10));   } 
		catch (ArithmeticException ae) 
		{ 
			System.out.println("Ratan soft");   
		}  
		catch (StringIndexOutOfBoundsException  se) 
		{
			System.out.println("durga soft");   
		} 
		
		System.out.println("rest of the code");  
		
	}

	}


