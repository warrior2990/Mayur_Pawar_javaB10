import java.util.Scanner;

public class GradingSystem {
	
	public static void main(String[] args) {
		
		GradingSystem obj = new GradingSystem();
		obj.CheckGrade();
		
	}

	void CheckGrade() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int marks = sc.nextInt();
		
		System.out.println("Entered Total Marks :"+marks);

	if(marks>=80) {
		
		System.out.println("You Got A grade");
	}else if (marks>=60 && marks<=80) {
		
		System.out.println("You Got B grade");
	}else if (marks>=50 && marks<=60) {
		
		System.out.println("You Got C grade");
	}else if (marks>=45 && marks<=50) {
		
		System.out.println("You Got D grade");
	}else if (marks>=25 && marks<=45) {
		
		System.out.println("You Got E grade");
	}else if (marks<=25) {
		
		System.out.println("You Got F grade");
	}
}
}
