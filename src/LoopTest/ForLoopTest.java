package LoopTest;

import java.util.Iterator;

public class ForLoopTest {

	public static void main(String[] args) {
		
		
		ForLoopTest obj = new ForLoopTest();
		obj.printTables();
		//obj.printNumberUsingWhile();
		//obj.printNumberUsingDoWhile();
	}
	
	void printNumberUsingDoWhile() {
		
		int i = 5;
		do {
			System.out.println(i);
			i--;
			break;
			
		} while (i >= 1);
	}
	void printNumberUsingWhile() {
		
		int i = 1;
		while(i <= 5) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("After While Loop");
	}
	
	void printTables() {
	
		System.out.println("Using Extra Variable");
		int j = 2;
		
		for(int k=1; k<=10; k++) {
			if(k==5)
				continue;
			System.out.println(j*k);
		}
		
		System.out.println("Using One Variable");
		for(int i=2; i<=20; i=i+2) {
			
			System.out.println(i);
			
			}
		
		System.out.println("Using Modulo Operator");
		for(int i=2; i<=20; i++) {
			
			if(i%2 == 0) {
			System.out.println(i);
			}
		}
	}


	void printNumber() {
		
for (int i=5; i>=1; i--) {
			
			System.out.println(i);
		}
		
		System.out.println("After For loop");
	}
}
