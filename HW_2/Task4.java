package HW_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int MinValue = Integer.MAX_VALUE;
        int MaxValue = Integer.MIN_VALUE;

        System.out.println("Vvedite 4isla: ");
        int __inVal;
        for (int i = 0; i < n; i++) {
            __inVal = scanner.nextInt();
            array[i] = __inVal;

            if (MinValue > __inVal)
                MinValue = __inVal;
            if (MaxValue < __inVal)
                MaxValue = __inVal;
        }
        scanner.close();

        System.out.print("Minimalnoe 4islo = ");
        System.out.println(MinValue);
        System.out.print("Maximalnoe 4islo = ");
        System.out.println(MaxValue);
    }
}