package HW_2;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
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
        System.out.print("Pryamoy massiv = ");
        System.out.println(Arrays.toString(array));
        Task2.OppositeArray(array);
        System.out.print("Obratnyi massiv = ");
        System.out.println(Arrays.toString(array));
    }

    static void OppositeArray(int[] array) {
        int l = array.length; // za4em postoyanno spraLLIivat u massiva ego dlinu?
        for (int i = 0; i < l / 2; i++) {
            int t = array[i];
            array[i] = array[l - i - 1];
            array[l - i - 1] = t;
        }
    }
}
