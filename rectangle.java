import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int minX = Math.min(x1, x2);
        int minY = Math.min(y1, y2);
        int maxX = Math.max(x1, x2);
        int maxY = Math.max(y1, y2);

        if (minX >= 10 && minY >= 10 && maxX <= 200 && maxY <= 300) {
            System.out.printf("(%d, %d), (%d, %d) 사각형은 (10, 10) (200, 300) 사각형에 포함된다.\n", minX, minY, maxX, maxY);
        } else {
            System.out.printf("(%d, %d), (%d, %d) 사각형은 (10, 10) (200, 300) 사각형에 포함되지 않는다.\n", minX, minY, maxX, maxY);
        }

        scanner.close();
    }
}