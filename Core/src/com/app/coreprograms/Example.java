package com.app.coreprograms;

public class Example {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		for(int i=0;i<5000;i++)
		{
			String s1="hello";
			String s2="hello";
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken for creation" 
		+"of String literals:"+ (endTime - startTime)
		+ "milli seconds");
		long strartTime1=System.currentTimeMillis();
		
		for(int i=0; i<5000; i++)
		{
			String s3=new String("hello");
			String s4=new String("hello");
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("time taken for creation "+" of string objects:" +(endTime1 - strartTime1)+"milli seconds");
		
		
		
		
		
		
		
}
}