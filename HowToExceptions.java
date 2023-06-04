package com.learn.ExceptionHandling;

//import java.util.Scanner;

public class HowToExceptions {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in); 
		//System.out.println("Enter the 2 values");
	
		int a=4;
		int b=0;
		//double c=a/b;

		System.out.println("We are learning Java Exception Handling");
		System.out.println("Learn further");
		
		try {
			double c=a/b;
			System.out.println("after");

			}catch(ArithmeticException e){
				System.out.println(e);
		}finally {
			System.out.println("This will always print");
		}
	}
	
}
