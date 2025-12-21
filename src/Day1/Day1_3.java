package Day1;
import  java.util.Scanner;
public class Day1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mention the Day no in the program: ");
        int day = sc.nextInt();
        if (day > 31) {
            System.out.println("Invalid input");
        } else {
            int rem = day % 7;
            switch (rem) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}