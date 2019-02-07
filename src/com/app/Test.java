package com.app;

public class Test extends Exception{	
	
	public Test(){}
	public Test(String str){
		super(str);
	}
	
	int importantData = 6;
	public static void main(String[] args){
		Test t = new Test();
		try {
			t.importantMethod();
		} catch (Test e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void importantMethod() throws Test {
		if( importantData > 5)
			throw new Test("Important data is invalid");
		else
			System.out.println(importantData);
	}
	
}