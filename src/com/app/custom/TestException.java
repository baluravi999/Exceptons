package com.app.custom;

import java.util.Scanner;

public class TestException {

	
	public static void ageMethod(int n)throws UserException
	{
		
		if(n<18){
			
		throw new UserException("invalid age, not allowed");
		}else {
			System.out.println("welcome to user ");
		}
	}
	
	public static void main(String[] args) {
		try {
			ageMethod(2);
		} catch (UserException e) {
			
			System.out.println("plese enter valid age "+e);
		}
		System.out.println("rest of the code");
		
		try   { 
			System.out.println(10/0);  
			}  
		//System.out.println("anu");  try with immidiate catch block otherwise exception
		catch(ArithmeticException e)  
		{   System.out.println(10/2);   } 
		System.out.println("rest of the app"); 
		
		
		
	
}}
