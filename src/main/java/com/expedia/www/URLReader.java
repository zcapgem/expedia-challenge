package com.expedia.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
	
	String title;
	String description;
	
	public BufferedReader brFromURL(String urlName) throws IOException {

		// Create InputStream from URL object
		URL u = new URL(urlName);
		InputStream is = u.openStream();

		// Create BufferedReader from InputStreamReader object
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		 
		String s =br.readLine();
		while (s!=null) {
			
			if (s.contains("<title>")) {
				title = s;
				System.out.println(s);
			} else if(s.contains("<meta name=\"description")) {
				description = s;
				System.out.println(s);
				
			}
			s =br.readLine();
		}
		return br;

	}

	public URLReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		
	}

}
