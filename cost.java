import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("여행지 >> ");
        String destination = scanner.nextLine();

        System.out.print("인원수 >> ");
        int people = scanner.nextInt();

        System.out.print("숙박일 >> ");
        int stayDays = scanner.nextInt();

        System.out.print("1인당 항공료 >> ");
        int airfarePerPerson = scanner.nextInt();

        System.out.print("1방 숙박비 >> ");
        int roomCostPerNight = scanner.nextInt();

        int totalAirfare = people * airfarePerPerson;
        int roomCount = (people + 1) / 2;
        int totalRoomCost = roomCount * stayDays * roomCostPerNight;
        int totalCost = totalAirfare + totalRoomCost;

        System.out.printf("%d명의 %s %d박 %d일 여행에는 %d개 필요하며 경비는 %d 원입니다.\n", 
                          people, destination, stayDays, stayDays + 1, roomCount, totalCost);
        
        scanner.close();
    }
}