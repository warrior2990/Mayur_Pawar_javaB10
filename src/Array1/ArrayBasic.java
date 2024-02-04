package Array1;

import java.util.Scanner;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		int[] rollNum = new int[10];
		
		rollNum[0] = 1;
		rollNum[1] = 2;
		rollNum[2] = 3;
		rollNum[3] = 4;
		rollNum[4] = 5;
		rollNum[8] = 9;
		
		ArrayBasic obj = new ArrayBasic();
		obj.getArrayValue(rollNum);
		
	}
	
	void getArrayValue(int[] rollArray) {
		
//		System.out.println(rollArray[0]);
//		System.out.println(rollArray[1]);
//		System.out.println(rollArray[2]);
//		System.out.println(rollArray[3]);
		
		for(int i=0; i < rollArray.length; i++) {
			
			System.out.println(rollArray[i]);
		}
	}
	
	void VariableAddition() {
		
        int num = 10;
		
		System.out.println("Enter First Number");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
			
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		int res = num1 + num2;
		
		System.out.println("Addition of Two Number:"+res);
	}

}
