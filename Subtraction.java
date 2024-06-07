import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a Random
        Random random = new Random();

        // Generate two single-digit integers
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        // If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;1
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer "What is number1 - number2?"
        System.out.println("What is " + number1 + " - " + number2 + "?");
        int answer = input.nextInt();

        // Check the student's answer and display whether the answer is correct
        if (number1 - number2 == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }

        // Close the Scanner
        input.close();
    }
}
