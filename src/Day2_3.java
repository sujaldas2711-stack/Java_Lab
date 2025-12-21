import java.util.Scanner;

class box{
    int length;
    int width;
    int height;
    double volume(){
        return length*width*height;
    }
}
public class Day2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        box demo = new box();
        System.out.println("Enter length of the Day_2.box: ");
        demo.length = sc.nextInt();
        System.out.println("Enter width of the Day_2.box: ");
        demo.width = sc.nextInt();
        System.out.println("Enter height of the Day_2.box: ");
        demo.height = sc.nextInt();
        double vol = demo.volume();
        System.out.println("Volume is: " + vol);

    }
}