package array2;

public class StudentAnother {
	
	
	void printArray(Student[] arr) {
	
		System.out.println("Inside StudentAnother class ");
		
		for (Student sObj : arr) {
			
			System.out.println("Roll No is-"+sObj.rno);
			System.out.println("Name is-"+sObj.name);
		}
		
	}

}
