class ArithmeticOperation{

	public static void main(String args[]){
	
		System.out.println("ArithmeticOperation");
		Addition();
		Substraction();
		Multiplication();
		Division();
	}
	
	public static void Addition(){
	
		int value1 = 10;
		int value2 = 30;
	
		int Add = value1 + value2;
	
		System.out.println("Addition of Two Number is:"+Add);

	}
	
	public static void Substraction(){
	
		int value3 = 10;
		int value4 = 30;
	
		int Sub = value4 - value3;
	
		System.out.println("Substraction of Two Number is:"+Sub);

	}
	
		public static void Multiplication(){
	
		int value5 = 100;
		int value6 = 2;
	
		int Mul = value5 * value6;
	
		System.out.println("Multiplication of Two Number is:"+Mul);

	}
	
		public static void Division(){
	
		int value7 = 10;
		int value8 = 2;
	
		int Div = value7 / value8;
	
		System.out.println("Division of Two Number is:"+Div);

	}
}