package com.java.questions;

//1. How do you reverse a string in Java?
public class ReverseString {

	public static void main(String args[]) {
		String inputString = "Hello";
		String str1 = reveseString(inputString);
		System.out.println("str1 --- "+str1);
		
		String str2 = reverse(inputString);
		System.out.println("str2 --- "+str2);
		
		int number = 23454;
		int reversednumber =  reverseNumber(number);
		System.out.println("reversednumber --- "+reversednumber);
		
	}
	
	public static int reverseNumber(int number) {
		int temp = number, r, sum=0;
		while(number>0) {
			r = number%10;
			sum = (sum*10)+r;
			number = number/10;
			
		}
		return sum;
	}
	
	public static String reveseString(String str) {		
		String revStr = "";		
		for(int i = str.length()-1; i>=0 ; i--) {
			revStr = revStr + str.charAt(i);
		}		
		return revStr;
	}
	
	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
