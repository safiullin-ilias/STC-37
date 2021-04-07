package HW_4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite 4islo dlya proverki: ");
        int Number = scanner.nextInt();
        scanner.close();
        if (IsPowerOf2(Number))
            System.out.println("4islo " + Number + " - stepen dvoiki");
        else
            System.out.println("4islo " + Number + " - ne stepen dvoiki");
    }

    static boolean IsPowerOf2(int number) {
        if (number % 2 == 1)
            return false;
        if (number % 2 == 0)
            return true;
        else return IsPowerOf2(number / 2);
    }
}
