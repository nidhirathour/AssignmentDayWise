package demo19thdate;

import java.util.Scanner;

public class jan31stAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//Q1)  Write a program to print the product of the decimal and Int number ex: 8.2*6
		System.out.println("Enter first Integer no for multiplcation");
		int firstnum = sc.nextInt();
		System.out.println("Enter Second decimal no for multiplcation");
		double secondnum = sc.nextDouble();
		double result=(double)firstnum * secondnum;//explicit conversion
		System.out.println("So multiplcation of two number will be = "+result);*/
		
		//Q2) Print the ASCII value of any character by user provide.
		
		/*System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		int a =ch;//implicit conversion
		System.out.println("User Entered: "+ ch +" whose ASCII value is "+ a);*/
		
		//Q3) User take 3 character and then add the all the summession of all the ASCII value and print
		// that equal to equivalent character 
		
		/* int sum=0;
    	System.out.println("Enter first  character");
		char ch1 = sc.next().charAt(0);
		System.out.println("Enter second  character");
		char ch2 = sc.next().charAt(0);
		System.out.println("Enter third  character");
		char ch3 = sc.next().charAt(0);
		sum = (int)ch1+ch2+ch3 ;
		char charactervalue = (char)sum;
		System.out.println("the summession of the ASCII value of all the character = "+ sum);
		System.out.println("So "+ sum +" is the ASCII value of " + charactervalue);*/
		
		
		// Q4) WAP to convert the temperature from Fahrenheit to Celsius Degree
		/* double tc;
		System.out.println("Enter the temperature in fahrenheit for chanfing into celcius");
		double tf = sc.nextDouble();
		tc = (tf-32)/1.8; 
		System.out.println(tf + "F After converting in celcius "+ tc +"C");*/
		
		
		// Q5) WAP read a number in inches and convert it into meters. 1m=>39.37inch and 1inch => 0.0254m
		
		/*System.out.println("Enter Inch: ");
		float inch= sc.nextFloat();
		float meter = inch* 0.0245f;
		System.out.println(inch +" inch = " + meter+ " meter");*/
		
		// Q6) Take input as String and after reversing print that on Console
		
		/*System.out.println("Enter your city name plz: ");
		String cityName= sc.next();
		char rev;
		String result=" ";
		
		for(int i=0;i<cityName.length();i++)
		{
			rev= cityName.charAt(i);
			result= rev+ result;
		}
		System.out.println(result);*/
		
		//Palindrome or not ex nayan
		
       /* System.out.println("Enter plz: ");
		String Name= sc.next();
		
		char rev;
		String result=" ";
		
		for(int i=0;i<Name.length();i++)
		{
			rev= Name.charAt(i);
			result= rev+ result;
		}
		if(result.equalTo(Name)) {
		   System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		*/
}

}
