package HW_2;

import java.util.Scanner;

public class Task7 {

    // mo}|{no i 4etyre ifa,
    // No mne rodnee switch case + tnum
    enum Direction {
        TOP,
        RIGHT,
        BOTTOM,
        LEFT
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite vysotu massiva: ");
        int n = scanner.nextInt();
        System.out.print("Vvedite LLIirinu massiva: ");
        int m = scanner.nextInt();
        scanner.close();
        int[][] matrix = new int[n][m];
        Direction direction = Direction.RIGHT;
        matrix[0][0] = 1;
        int x = 0, y = 0;
        int step = 1, max_step = m * n;
        while (step < max_step) {
            switch (direction) {
                case BOTTOM:
                    while (y + 1 < n && matrix[y + 1][x] == 0) {
                        matrix[y + 1][x] = matrix[y++][x] + 1;
                    }
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    while (x > 0 && matrix[y][x - 1] == 0) {
                        matrix[y][x - 1] = matrix[y][x--] + 1;
                    }
                    direction = Direction.TOP;
                    break;
                case RIGHT:
                    while (x + 1 < m && matrix[y][x + 1] == 0) {
                        matrix[y][x + 1] = matrix[y][x++] + 1;
                    }
                    direction = Direction.BOTTOM;
                    break;
                case TOP:
                    while (y > 0 && matrix[y - 1][x] == 0) {
                        matrix[y - 1][x] = matrix[y--][x] + 1;
                    }
                    direction = Direction.RIGHT;
                    break;
            }
            step ++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print('\t');
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n\r");
        }
    }
}
