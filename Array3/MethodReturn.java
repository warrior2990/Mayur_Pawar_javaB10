package Array3;

public class MethodReturn {
	
	public static void main(String[] args) {
		
		MethodReturn obj = new MethodReturn();
		int res = obj.addition(10, 20);
		
		System.out.println("Addition of two Number is :"+res);
	}
	
	int addition(int val1, int val2) {
		
		int res = val1 + val2;
		return res;
	}
}
