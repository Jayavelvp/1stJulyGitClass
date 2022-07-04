package org.test;

public class GitTest {
			public static void main(String[] args) {
				
				String s1 = "malayalam";
				String s2 = "";
			 for(int i=s1.length()-1;i>=0;i--) {
			char c = s1.charAt(i);	 
				s2 = s2+c;
			 }
			 if(s1.equals(s2)) {
				 System.out.println("palindrome");
			 }
			 else {
				 System.out.println("not a palindrome");
				 }
			}
	}


