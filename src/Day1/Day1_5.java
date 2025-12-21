package Day1;
import java.util.Scanner;
public class Day1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first name: ");
        String f_name = sc.nextLine();
        System.out.println(" Enter Second name: ");
        String l_name = sc.nextLine();
        String c = l_name + " " + f_name;
        System.out.println("Full name is: " + c);
    }
}