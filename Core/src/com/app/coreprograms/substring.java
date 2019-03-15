package com.app.coreprograms;

public class substring {
public static void main(String[] args) {
	String str = "Hello World"; 	
	System.out.println("first="+str);
    System.out.println( str.replace( 'H','W' ) ); 	
    System.out.println("second="+str);
    System.out.println(str);
    System.out.println("third="+str);
    System.out.println( str.replaceFirst("He", "Wa") );
    System.out.println("fourth="+str);
    System.out.println( str.replaceAll("He", "Ha") );
}
}
