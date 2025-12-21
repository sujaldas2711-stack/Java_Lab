import java.util.Scanner;

class Substract{
    void substract(int a, int b){
        System.out.println("Substraction of two integers is: "+(a-b));
    }
    void substract(int a, int b, int c){
        System.out.println("Substraction of three integers is: "+(a-b-c));
    }
    void substract(double a, double b){
        System.out.println("Substraction of two numbers is: "+ (a-b));
    }
}
public class Day2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Substract s = new Substract();
        s.substract(3,2);
        s.substract(5,3,2);
        s.substract(4.5, 3.2);
    }
}