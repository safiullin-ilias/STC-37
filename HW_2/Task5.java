package HW_2;

import java.util.Scanner;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Vvedite 4isla: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print("Vvedenny massiv = ");
        System.out.println(Arrays.toString(array));
        Task5.BubbleSortArray(array);
        System.out.print("Sortirovanny massiv = ");
        System.out.println(Arrays.toString(array));
    }

    static void BubbleSortArray(int[] array) {
        int l = array.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++)
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
        }
    }
}
