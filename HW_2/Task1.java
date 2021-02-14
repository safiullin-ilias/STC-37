package HW_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int arraySum = 0;

        System.out.println("Vvedite 4isla: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }
        scanner.close();

        System.out.print("Summa 4isel = ");
        System.out.println(arraySum);
    }
}
