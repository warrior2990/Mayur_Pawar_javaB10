import java.util.Scanner;

public class DecisionStmt {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Eclipse");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Age");
		
		int age =  sc.nextInt();
		
		if(age>=18 && age<30) {
			
			System.out.println("You are Eligibale for voting");
			System.out.println("You Are Young");
		}else if(age>30){
			
			System.out.println("You Are Adult");
		}else {
			
			System.out.println("You Are Not Eligible for Voting");
		}
	}

}
