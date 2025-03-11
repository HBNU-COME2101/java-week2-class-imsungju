
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("생일 입력 하세요 >> ");
        int birthday = scanner.nextInt();
        
        
        int year = birthday / 10000;          
        int month = (birthday % 10000) / 100;
        int day = birthday % 100;             
        
        
        System.out.println(year + "년 " + month + "월 " + day + "일");
        
        
        scanner.close();
    }
}