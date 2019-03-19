package Day1;

import java.util.Scanner;
public class SwitchCaseMode{

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Valve of a");
		int a = scan.nextInt();
		
		System.out.println("Enter the Valve of b");
		int b = scan.nextInt();
		
		  if(b<10 && b>0){
		    int c = a%b;
		    switch(c) {
		    case 0:
		    	System.out.print("zero");
		    	break;
		    case 1:
		    	System.out.print("one");
		    	break;
		    case 2:
		    	System.out.print("two");
		    	break;
		    case 3:
		    	System.out.print("three");
		    	break;
		    case 4:
		    	System.out.print("four");
		    	break;
		    case 5:
		    	System.out.print("five");
		    	break;
		    case 6:
		    	System.out.print("six");
		    	break;
		    case 7:
		    	System.out.print("seven");
		    	break;
		    case 8:
		    	System.out.print("eight");
		    	break;
		    case 9:
		    	System.out.print("nine");
		    	break;
		    	default:
		    		System.out.print("modulus valve is > 10");
		    	}
		    
		    
		  //  String str = Integer.toString(c);
		  //  System.out.println("The value of c is" + str);
		  }
		  else
	System.out.println("Enter the correct valve of b");	
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */


}
}
