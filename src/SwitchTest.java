
public class SwitchTest {
	
	public static void main(String[] args) {
		
		char c ='A';
		
		switch (c) {
		case 'A':
			
			System.out.println("Entered Char is Vowel and it is A");
			break;
		case 'E':
			
			System.out.println("Entered Char is Vowel and it is E");
			break;
		case 'I':
			
			System.out.println("Entered Char is Vowel and it is I");
			break;
		case 'O':
			
			System.out.println("Entered Char is Vowel and it is O");
			break;
		case 'U':
			
			System.out.println("Entered Char is Vowel and it is U");
			break;

		default:
			System.out.println("Entered Char is Not Vowel ");
			break;
		}
	}

}
