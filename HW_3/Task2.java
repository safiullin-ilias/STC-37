package HW_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Metod Simpsona dla >= 3 4isel");
        }
        int[] array = new int[n];

        System.out.println("Vvedite 4isla: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.print("Zna4enie integrala = ");
        System.out.println(Task2.Simpson(array));
    }

    static double Simpson(int[] array) {
        double s = 0;
        int l = array.length;
        for (int i = 1; i < l - 1; i += 2) {
            s += array[i - 1] + 4 * array[i] + array[i + 1];
        }
        return s * 2 / 3.0;
    }
}
