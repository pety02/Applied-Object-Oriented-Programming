import java.util.Scanner;

public class FiveDigitsNumber {

    // Метод, който проверява дали едно число е палиндром
    public static boolean isPalindrome(int number) {
        String num = "" + number;
        String reversedNum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversedNum += num.charAt(i);
        }

        return num.equals(reversedNum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int originalNumber;

        // Въвеждаме 5-цифрено число
        System.out.print("Enter five digits number: ");
        do {
            originalNumber = input.nextInt();

            // Извежда грешка, ако числото не е 5-цифрено
            if(originalNumber < 9999 || originalNumber > 99999) {
                System.out.println("Error: You shuld enter five digits number!");
            }
        } while(originalNumber < 9999 || originalNumber > 99999);

        // Отпечатва дали числото е палиндром или не
        System.out.print("Number "  + originalNumber + (isPalindrome(originalNumber)
                ? " is palindrome!" : "is not a palindrome!"));
    }
}