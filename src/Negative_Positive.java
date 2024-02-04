import java.util.Scanner;

public class Negative_Positive {
	
	public static void main(String[] args) {
		
		Negative_Positive obj = new Negative_Positive();
		obj.ngpNumber();
		
	}

	void ngpNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int numb = sc.nextInt();
		
		System.out.println("Entered Number is:"+numb);
		
		if(numb>=0) {
			
			System.out.println("Entered Number is :"+numb);
			System.out.println("Number is Positive");
		}else if(numb<0) {
			
			System.out.println("Entered Number is :"+numb);
			System.out.println("Number is negative");
		}
		
	}
}
