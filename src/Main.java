import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isProbableTopper = isProbableTopperNumber(number);
        System.out.println(isProbableTopper);
    }

    public static boolean isProbableTopperNumber(int number) {
        int oddSum = 0;
        int evenSum = 0;
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return oddSum == evenSum;
    }
}