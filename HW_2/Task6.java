package HW_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        
        System.out.print("Vvedite koili4estvo tsifr: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        byte[] array = new byte[n];
        int number = 0;

        System.out.println("Vvedite 4isla: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextByte();
            if (array[i] > 9) {
                System.out.println("NE tsifra (nado [0-9])");
                scanner.close();
                return;
            }
            number = number * 10 + array[i];
        }
        scanner.close();
        System.out.print("Vvedennje 4islo = ");
        System.out.println(number);
    }
}
