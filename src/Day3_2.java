import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Length: " + length);
        System.out.println("Width : " + width);
    }
}
class Box extends Plate {
    double height;
    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Height: " + height);
    }
}
class WoodBox extends Box {
    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height); // Call Box constructor
        this.thick = thick;
        System.out.println("Thickness: " + thick);
    }
}

public class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions:");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        System.out.print("Thickness: ");
        double thick = sc.nextDouble();
        WoodBox wb = new WoodBox(length, width, height, thick);

    }
}
