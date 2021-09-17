import java.util.Date;
import java.util.Scanner;

public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Now is: " + now);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập");
        String a1 = scanner.nextLine();
        System.out.println(a1);

        System.out.println("Mời bạn nhập số");
        int a = scanner.nextInt();
        System.out.println(a);
    }
}
