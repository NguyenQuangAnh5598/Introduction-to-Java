import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn chuyển");
        double money = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập loại tiền muốn đổi sang(VNĐ or USD)");
        String type = scanner.nextLine();

        if (type.equals("VNĐ")) {
            double vnd = money * 23000;
            System.out.println(money + "USD = " + vnd + "VNĐ");
        } else {
            if (type.equals("USD")) {
                double usd = money/23000;
                System.out.println(money + "VNĐ = " + usd + "USD");
            }
            else {
                System.out.println("Error");
            }
        }
    }
}
