
import java.util.Scanner;
public class Day1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int n;
        for (int i = num; i> 0; i/=10){
            n = i % 10;
            rev = rev*10 + n;
        }
        if (rev == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}