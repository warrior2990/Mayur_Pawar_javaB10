import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		obj.checkEvenorOdd();		
	}
	
	void checkEvenorOdd() {
		
		System.out.println("Enter Any Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if(num%2 == 0) {
			
			System.out.println("Entered Number is Even");
		}else {
			
			System.out.println("Entereted Number is Odd");
		}
	}
}
