package Day2;
import java.util.Scanner;

class number{
    static int count = 0;
    number(){
        count++;
    }
}
public class Day2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day_2.number of objects: ");
        int num = sc.nextInt();
        for (int i = 0; i< num; i++){
            number obj = new number();
        }
        System.out.println("Total Day_2.number of objects: " + number.count);
    }
}