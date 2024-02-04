package Array2;

public class StudentAnother {
	
	void printArray(Student[] arr) {
		
		System.out.println("Inside StudentAnother Class");
		for (Student sObj : arr) {
			
		
			System.out.println("Roll No Is: "+sObj.rno);
			System.out.println("Name Is: "+sObj.name);
			
		}
		
	}

}
