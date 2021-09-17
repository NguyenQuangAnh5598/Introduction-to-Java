import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập só muốn đọc vào đây");
        int number = scanner.nextInt();

        if (number >= 0 && number < 20) {
            units(number);
        }
        if (number >= 20 && number < 100) {
            int first = (number - (number % 10)) / 10;
            int second = number % 10;
            dozens(first);
            units(second);
        }
        if (number >= 100 && number < 1000) {
            int first = (number - (number % 100)) / 100;
            int second = ((number % 100) - ((number % 100) % 10)) / 10;
            int third = (number % 100) % 10;
            units(first);
            System.out.print(" hundred and ");
            dozens(second);
            units(third);
        }
    }

    public static void units(int num) {
        String read = "";
        switch (num) {
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nice";
                break;
            case 10:
                read = "ten";
                break;
            case 11:
                read = "eleven";
                break;
            case 12:
                read = "twelve";
                break;
            case 13:
                read = "thirteen";
                break;
            case 14:
                read = "fourteen";
                break;
            case 15:
                read = "fifteen";
                break;
            case 16:
                read = "sixteen";
                break;
            case 17:
                read = "seventeen";
                break;
            case 18:
                read = "eighteen";
                break;
            case 19:
                read = "nineteen";
                break;
        }
        System.out.print(read);
    }

    public static void dozens(int num) {
        String readDozens = "";
        switch (num) {
            case 2:
                readDozens = "twenty ";
                break;
            case 3:
                readDozens = "thirty ";
                break;
            case 4:
                readDozens = "forty ";
                break;
            case 5:
                readDozens = "fifty ";
                break;
            case 6:
                readDozens = "sixty ";
                break;
            case 7:
                readDozens = "seventy ";
                break;
            case 8:
                readDozens = "eighty ";
                break;
            case 9:
                readDozens = "ninety ";
                break;
        }
        System.out.print(readDozens);
    }
}
