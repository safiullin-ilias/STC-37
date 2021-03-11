package HW_4;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int n ;
        if (false) {
            System.out.print("Vvedite koili4estvo 4isel: ");
            n = scanner.nextInt();
            array = new int[n];

            System.out.println("Vvedite 4isla: ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }
        else {
            int[] mock = {3, 2, 10, -5, 15, 18, -50};

            n = mock.length;
            array = mock;
        }


        HW_3.Task1.BubbleSortArray(array);
        
        System.out.print("Sortirovanny massiv = ");
        System.out.println(Arrays.toString(array));



        System.out.print("Vvedite 4islo dlya poiska: ");
        int Number = scanner.nextInt();
            scanner.close();

        int index = binarySearch(array, Number, 0, n - 1);

        if (index == -1)
            System.out.println("4islo " + Number + " - ne naideno");
        else
            System.out.println("4islo " + Number + " - naideno. Nomer = " + index);
    }
    public static int binarySearch(int[] array, int element, int start, int finish) {
        if (start >= finish)
            return -1;
        int center = (start+finish)/2;
        if (array[center] > element)
            {
                return binarySearch(array, element, start, center - 1);
            }
            else if (array[center] < element)
            {
                return binarySearch(array, element, center + 1, finish);
            }
            else
            {
                return center;
            }
    }
}
