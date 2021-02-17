package HW_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        int MinValue = Integer.MAX_VALUE, minInd = 0;
        int MaxValue = Integer.MIN_VALUE, maxInd = 0;

        System.out.println("Vvedite 4isla: ");
        int __inVal;
        for (int i = 0; i < n; i++) {
            __inVal = scanner.nextInt();
            array[i] = __inVal;

            if (MinValue > __inVal) {
                MinValue = __inVal;
                minInd = i;
            }
            if (MaxValue < __inVal) {
                MaxValue = __inVal;
                maxInd = i;
            }
        }
        scanner.close();
        
        System.out.print("Vvedenyi massiv = ");
        System.out.println(Arrays.toString(array));

        int t = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = t;

        System.out.print("Min-Max massiv = ");
        System.out.println(Arrays.toString(array));
    }
}