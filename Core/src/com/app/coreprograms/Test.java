package com.app.coreprograms;

public class Test {
public static void main(String[] args) {
	String s1="abc";
	String s2=new String("abc");
	System.out.println(s1==s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
