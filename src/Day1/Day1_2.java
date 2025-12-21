package Day1;
import java.util.Scanner;
public class Day1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks(0-100): ");
        int marks = sc.nextInt();
        if (marks>= 90 && marks<= 100){
            System.out.println("O grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("E grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("A grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B grade");
        }
        else {
            System.out.println("C grade");
        }
    }
}