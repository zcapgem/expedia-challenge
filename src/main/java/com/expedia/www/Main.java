package com.expedia.www;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;





public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here	
    	System.out.println("	Welcome to the Expedia challenge	");
    	System.out.println("\n Please select one of the below options:"
    			+ "\n Edit a web page" + "\n Editing report" + "\n Exit application");
      	System.out.print("\n Input a URL");
    	
      	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	
 
    	System.out.println("\n Your URL is " + s);
    	 
    	URLReader u = new URLReader();
    	BufferedReader br = u.brFromURL(s); 
    	
    	System.out.println(br.readLine());
    	

    }
    
}