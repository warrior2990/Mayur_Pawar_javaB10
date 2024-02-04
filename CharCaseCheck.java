import java.util.Scanner;

public class CharCaseCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isLowerCase(inputChar)) {
            System.out.println("The entered character is lowercase.");
        } else if (Character.isUpperCase(inputChar)) {
            System.out.println("The entered character is uppercase.");
        } else {
            System.out.println("The entered character is not a letter.");
        }
    }
}
