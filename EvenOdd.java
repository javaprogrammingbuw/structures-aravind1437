import java.util.Scanner;

//loops

public class EvenOdd{

	public static void main(String[] args) {

		System.out.println("Enter a limit");
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();

		System.out.println("The odd numbers are");
		for(int i=1;i<limit;i++){
		    if(i % 2 != 0){
		        System.out.println(i + " ");
		    }
		}
	}
}

