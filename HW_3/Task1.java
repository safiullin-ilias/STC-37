package HW_3;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Vvedite koili4estvo 4isel: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] array_2 = new int[n];

        System.out.println("Vvedite 4isla: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Vvedenny massiv = ");
        System.out.println(Arrays.toString(array));

        System.out.print("Summa massiva = ");
        System.out.println(Task1.ArraySum(array));

        array_2 = Task1.CopyArray(array);
        Task1.OppositeArray(array_2);
        System.out.print("Obratnyi massiv = ");
        System.out.println(Arrays.toString(array_2));

        System.out.print("Srednee massiva = ");
        System.out.println(Task1.ArrayAvg(array));

        array_2 = Task1.CopyArray(array);
        Task1.MinMaxArray(array_2);
        System.out.print("Min-Max massiv = ");
        System.out.println(Arrays.toString(array_2));

        array_2 = Task1.CopyArray(array);
        Task1.BubbleSortArray(array_2);
        System.out.print("Sortirovanny massiv = ");
        System.out.println(Arrays.toString(array_2));

        System.out.print("4islo iz massiva = ");
        System.out.println(Task1.ArrayToInt(array));
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

    static int ArrayToInt(int[] array) {
        int l = array.length;
        int number = 0;
        for (int i = 0; i < l; i++) {
            if (array[i] > 9 || array[i] < 0) {
                return -1;
            }
            number = number * 10 + array[i];
        }
        return number;
    }

    static int ArraySum(int[] array) {
        int l = array.length;
        int arraySum = 0;
        for (int i = 0; i < l; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }

    static double ArrayAvg(int[] array) {
        int l = array.length;
        return ArraySum(array) / (double) l;
    }

    static void OppositeArray(int[] array) {
        int l = array.length;
        for (int i = 0; i < l / 2; i++) {
            int t = array[i];
            array[i] = array[l - i - 1];
            array[l - i - 1] = t;
        }
    }

    static void MinMaxArray(int[] array) {
        int MinValue = Integer.MAX_VALUE, minInd = 0;
        int MaxValue = Integer.MIN_VALUE, maxInd = 0;

        int l = array.length;
        for (int i = 0; i < l; i++) {
            int __inVal = array[i];

            if (MinValue > __inVal) {
                MinValue = __inVal;
                minInd = i;
            }
            if (MaxValue < __inVal) {
                MaxValue = __inVal;
                maxInd = i;
            }
        }
        
        int t = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = t;
    }

    
    static int[] CopyArray(int[] array) {
        int l = array.length;
        int[] array_2 = new int[l];
        for (int i = 0; i < l; i++) {
            array_2[i] = array[i];
        }
        return array_2;
    }
}
