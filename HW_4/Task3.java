package HW_4;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    static int[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite nomer fibona4i: ");

        int Number = scanner.nextInt();
        scanner.close();
        numbers = new int[Number + 1];
        for (int j = 0; j <= Number; ++j) {
            numbers[j] = -1;
        }

        int fibo = fibona4i(Number);

        System.out.println("4islo " + fibo + " - pod nomerom " + Number);
    }
    static int fibona4i(int number) {
        if (number <= 1)
            return numbers[number] = number;
        int prev, prevprev;

        if (numbers[number - 1] != -1)
            prev = numbers[number - 1];
        else
            prev = fibona4i(number - 1);
        
        if (numbers[number - 2] != -1)
            prevprev = numbers[number - 2];
        else
            prevprev = fibona4i(number - 2);

        return numbers[number] = prev + prevprev;
    }
}
