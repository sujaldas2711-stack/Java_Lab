import java.util.Scanner;

class Rectangle_2{
    int length;
    int breadth;
    Rectangle_2(){
        length = 0;
        breadth = 0;
    }
    Rectangle_2(int l, int b){
        length = l;
        breadth = b;
    }
    void area(){
        double area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }
}
public class Day2_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle_2 r1 = new Rectangle_2();
        System.out.println("##Using Non-parameterized Constructor##");
        r1.area();
        System.out.println("##Using parameterized constructor##");
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        Rectangle_2 r2 = new Rectangle_2(l,b);
        r2.area();
    }
}