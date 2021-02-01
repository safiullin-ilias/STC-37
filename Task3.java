import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long Multiply = 0;
        String numbers = "";
        while (true) {
            int number = scanner.nextInt();
            if (number == 0)
                break;
            if (isPrimeNumber(digitsSum(number))) {
                if (Multiply == 0) {
                    Multiply = number;
                    numbers = String.valueOf(number);
                }
                else {
                    Multiply *= number;
                    numbers += " * " + String.valueOf(number);
                }                    
            }
        }
        if (numbers.length() == 0) {
            System.out.println("Ne naideny 4isla, summa tsifr kotoryih - prosta");
            return;
        }
        System.out.print(numbers);
        System.out.print(" = ");
        System.out.print(Multiply);
    }
    static boolean isPrimeNumber(int number) {
        if (number < 0)
            return false;
        if (number == 1 || number == 2)
            return true;
        int sqrt = (int)(Math.sqrt(number));
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    static int digitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
