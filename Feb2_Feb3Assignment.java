package demo19thdate;

import java.util.Scanner;

public class Feb2_Feb3Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Q1)Evaluate below expression without running the code	
		/*
		 
   int x = 9, y = 12;
   int a = 2, b = 4, c = 6;
   int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
   Note: No program is required. Just give value of exp by calculating manually.




   exp=  4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
   =   4/3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / (2 + 4*12);
   =   4/3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / (50);
   =   4/3 * (43) + 9 * (26) + (3 + 12 * (4)) / (50);
   =   4/3 * (43) + 9 * (26) + (3 + 12 * (4)) / (50);
   =   4/3 *  43 + 9 * 26 + 51/50;
   =   1 * 43 + 9 * 26 + 51/50;
   =   43 + 9 * 26 + 51/50; 
   =    43 + 234 + 1;
   = 278;

		 */
		//Q2) WAP to check whether given number is lesser or greater than 10 if its lesser than check further if its lesser or greater than 5 using ternary operator and Print greater or smaller accordingly.
        /*System.out.println("Enter no :");
        int n=sc.nextInt();
		
		boolean con1=n<10 && n<5;
		boolean con2 =n>10 && n>5;
	    String result;	
		
	  result = con1 ? "number is smaller than 5 and 10":(con2 ? "Number is greater than 5 and 10":"number is smaller than 10 but greater than 5");	  
	  System.out.println(result);*/
		
		//Q-3 ) WAP to check whether given number is 10,20,30,40,50 or not any of these using ternary operator.
				
				/*System.out.println("Enter no plz: ");
				int num = sc.nextInt();
				String str1 = "Yes";
				String str = "";
				str= (num==10||num==20||num==30||num==40||num==50)?"Yes":"No";
				if(str.equals(str1)) {
				 System.out.println(num + " is present");
				}
				else
				{
					 System.out.println(num+ "  is not present");
				}*/
		
	//	Q4) write a program to print name of the month by passing number of the month using ternary operator.

		
	
		/*System.out.println("Enter month number");
		int n=sc.nextInt();
		String result = null;
        result = n==1 ?"jan":(n==2 ? "feb":(n==3? "mar":(n==4? "april":(n==5?"may":(n==6?"june":(n==7?"july":(n==8 ? "aug":(n==9 ? "Sep":(n==10?"oct":(n==11?"nov":(n==12? "dec":"enter valid number")))))))))));
		System.out.println(result);*/
		
		//Q5)write a program to print given character is vowel or Consonant using ternary operator."

		System.out.println("Enter charcter from a to z or from A to Z");
		char n=sc.next().charAt(0);
		String result;
        result = n=='a'?"vowel":(n=='A'?"vowel":(n=='e' ? "vowel":(n=='E'? "vowel":(n=='i' ?"vowel":(n=='I'? "vowel":(n=='o'? "vowel":(n=='O'? "vowel" : (n=='u'? "vowel":(n=='U'?"vowel":"Consonant")))))))));
		System.out.println(result);
		
		
	}

}
