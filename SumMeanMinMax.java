package Day1;

import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Valve of a");
		int a = scan.nextInt();
		
		System.out.println("Enter the Valve of b");
		int b = scan.nextInt();
		
		System.out.println("Enter the Valve of c");
		int c = scan.nextInt();
		
		int sum = a+b+c;
		System.out.println("The sum is " + sum);
		int mean = sum/3;
		System.out.println("The mean is " + mean);
		
		System.out.println("The max valve is");
		System.out.println(Math.max(a, Math.max(b,c)));
		
		System.out.println("The min valve is");
		System.out.println(Math.min(a, Math.min(b,c)));
		
		
		//For Max Valve
		
		/*if(a>b && b<c) {5
			System.out.println("The max valve is a = " + a);
		}else if (a<b && b>c) {
			System.out.println("The max valve is b = " +b);
		}else {
			System.out.println("The max valve is b = " + c);
		}
		
		/*if(a<b && c>a) {
			System.out.println("The min valve is a = " + a);
		}else if(a>b && b<c) {
			System.out.println("The min valve is b = " + b);
		} else {
			System.out.println("The min valve is c = " + c);
		}*/

	}

}



