package main.java;

import java.util.Scanner;

import com.google.common.base.*;

public class DoSomething {
	
		// if there is a string input the string will be splittet at every whitespace und printed 
		public static void main(String[] args) {
			
			
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Geben Sie einen Text ein");
				String s = scan.next();
				Iterable<String> news = Splitter.on(CharMatcher.BREAKING_WHITESPACE).split(s);
				
				for(String dsa : news) {
					System.out.println(dsa);
				}

			
		}
		
		// same as main but after splitting the string, it gets concatinated again without ane whitespace
		public static String doSomething(String str) {
				Iterable<String> news = Splitter.on(CharMatcher.BREAKING_WHITESPACE).split(str);
				StringBuilder f = new StringBuilder();
				for (String d : news) {
					f.append(d);
				}
				
				return f.toString();
		}
}
