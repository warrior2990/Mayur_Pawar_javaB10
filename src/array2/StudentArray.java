package array2;

public class StudentArray {
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.rno = 10;
		obj1.name = "Rajendra";
		
		Student obj2 = new Student();
		obj2.rno = 11;
		obj2.name="Shivam";
		
		Student obj3 = new Student();
		obj3.rno = 12;
		obj3.name = "Kirti";
		
		
		Student[] stuArray = new Student[3];
		
		stuArray[0] = obj1;
		stuArray[1] = obj2;
		stuArray[2] = obj3;
		
		StudentArray obj = new StudentArray();
		obj.getStudent(stuArray);
		
		StudentAnother saObj = new StudentAnother();
		saObj.printArray(stuArray);
		
	}
	
	void getStudent(Student[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			Student sObj = arr[i];
			
			System.out.println("Roll No is-"+sObj.rno);
			System.out.println("Name is-"+sObj.name);
			
		}
	}

}
