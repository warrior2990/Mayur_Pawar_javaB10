package Assignment;

public class OddEvenArray {
	
	public static void main(String[] args) {
		
		int[] number = {33, 44, 67, 86, 99, 103};
		
		int EvenNum=0;
		int OddNum=0;
		
		for(int num : number) {
			
			if(num%2 == 0) {
				
				EvenNum++;
			}else {
				
				OddNum++;
			}
		}
		
        System.out.println("Given Array: {33, 44, 67, 86, 99, 103}");
        System.out.println("Number of even integers: " + EvenNum);
        System.out.println("Number of odd integers: " + OddNum);
	}
	

}
