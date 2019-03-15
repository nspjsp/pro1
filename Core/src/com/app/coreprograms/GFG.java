package com.app.coreprograms;

//Java program to Compare two strings 
//lexicographically 
public class GFG { 
public static void main(String[] args) {
	/*String s1="sachin";
	String s2="sachin";
	String s3=new String("sachin");
	String s4="saurav";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
*/	
	/*String s1="Sachin";  
	   String s2="SACHIN";  
	  
	   System.out.println(s1.equals(s2));//false  
	   System.out.println(s1.equalsIgnoreCase(s2));//true
*/	   
	   /*String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   System.out.println(s1==s2);//true (because both refer to same instance)  
	   System.out.println(s1==s3);//false(because s3 refers to instance created in non pool) 
*/	
	/*
	String s1="Sachin";
	String s2="Sachin";
	String s3="Ratan";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s1));*/
	
	String s1=new String("hi");
	String s2=s1.concat("hello");//run time created in heap memory, concat comes only heap area not in scp
	System.out.println(s2);
	
	String s3="hihello"; //String constant pool
	String s4=new String("hihello");//String constantpool and heap
	String s5=new String("hihello");
	System.out.println(s1==s2);//false
	System.out.println(s2==s3);//false
	System.out.println(s5==s4);//false
	
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	
	
	
	
}
} 