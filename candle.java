import java.util.Scanner;

public class candle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요>> ");
        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
            return;
        }

        int redCandles = age / 10;
        int blueCandles = (age % 10) / 5;
        int yellowCandles = (age % 10) % 5;

        StringBuilder result = new StringBuilder();

        if (redCandles > 0) {
            result.append("빨간 초 ").append(redCandles).append("개");
        }
        if (blueCandles > 0) {
            if (result.length() > 0) result.append(", ");
            result.append("파란 초 ").append(blueCandles).append("개");
        }
        if (yellowCandles > 0) {
            if (result.length() > 0) result.append(", ");
            result.append("노란 초 ").append(yellowCandles).append("개");
        }

        int totalCandles = redCandles + blueCandles + yellowCandles;

        System.out.println(result.toString() + ". 총 " + totalCandles + "개가 필요합니다.");

        scanner.close();
    }
}