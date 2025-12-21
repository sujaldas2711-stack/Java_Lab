import java.util.Scanner;
class Rectangle_1{
    int length;
    int breadth;
    Rectangle_1() {
        length = 0;
        breadth = 0;
    }
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        breadth = sc.nextInt();
    }
    double area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
    void display(){
        System.out.println("Area of Rectangle is : " + area());
        System.out.println("Perimeter of Rectangle is : " + perimeter());

    }
}
public class Day2_4 {
    public static void main(String[] args){
        Rectangle_1 myrect = new Rectangle_1();
        myrect.read();
        myrect.display();
    }
}