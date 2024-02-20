package inheritanceTest.hierachicalInhert;

public class Test {
	
	public static void main(String[] args) {
		
		Child1 obj1 = new Child1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		obj1.m1();
		obj1.m2();
		
		Child2 obj2 = new Child2();
		System.out.println(obj2.a);
		System.out.println(obj2.c);
		
		obj2.m1();
		obj2.m3();
		
	}

}
