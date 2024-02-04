import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
		
		GreatestNumber obj = new GreatestNumber();
		obj.checkGreatNumber();
		
	}
	
	void checkGreatNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
			
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		
		System.out.println("Entered First Number is:"+num1);
		System.out.println("Entered Second Number is:"+num2);
		
	if(num1>num2) {
		
		System.out.println("First Number is Greater and Number is:"+num1);
	} else if (num2>num1) {
		
		System.out.println("Second Number is Greater and Number is:"+num2);
	} else {
		
		System.out.println("Both the Numbers are Equal");
	}

}
}

 