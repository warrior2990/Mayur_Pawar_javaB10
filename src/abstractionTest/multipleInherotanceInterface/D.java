package abstractionTest.multipleInherotanceInterface;

public class D implements C {

	@Override
	public void m1() {
		System.out.println("In D-M1 method");
		
	}
	
	public static void main(String[] args) {
		
		D obj = new D();
		obj.m1();
		
	}

}
