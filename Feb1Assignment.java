package demo19thdate;
import java.util.Scanner;
public class Feb1Assignment {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		//Q1) WAP to caluclate no. of digits in a number entered by user
            /*    Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int count =0;
				while(n !=0) {
					n=n/10;
					++count;
				}
				System.out.println(count);
			}*/
	
		
	//Q2)  Apply do while loop to calculat factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
       
		
	    	  
		 
		/*int num;
       do {
       
       
    	   System.out.println("Enter 1 or 0");
 	      num = sc.nextInt();
 	  
       System.out.println("Enter no for factorial"); 
       int num1 = sc.nextInt();
       int i= factorial(num1);
       System.out.println(i);
       }while(num!=0);
       
      
       }

	private static int factorial(int no) {
		int fact=1;
		for(int j=no;j>0;j--) {
			fact= fact*j;
		}
		return fact;
		*/
		 
	
		 //Q3) WAP to creat a fuction that check if no. is odd or even. call this function from main method"
		 System.out.println("Enter num");
	      int num = sc.nextInt();
	      isEven(num);
	      
	     
	}
	 private static void isEven(int no) {
   	  if(no%2==0)
   	  {
   		  System.out.println(no + " is even");
   	  }
   	  else
   	  {
   		System.out.println(no + " is not even");
   	  }
     }
		 
}


