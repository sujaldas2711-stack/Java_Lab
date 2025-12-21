package Day3;
import java.util.Scanner;
class TwoD{
    int length;
    int breadth;
    TwoD(int l, int b){
        length = l;
        breadth = b;
    }

    int costSheet(){
        return length*breadth*40;
    }

}


class ThreeD extends TwoD {
    int height;

    ThreeD(int x,int y,int z) {
        length = x;
        breadth = y;
        height = z;
    }

    int costBox() {
        return length * breadth * height * 60;
    }
}

public class Day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for option\n1.SHEET\n2.BOX");
        int n=sc.nextInt();
        System.out.println("Enter dimensions :");
        System.out.println("Length:");
        int l= sc.nextInt();
        System.out.println("Breadth:");
        int b=sc.nextInt();
        if (n==1) {
            TwoD obj1 = new TwoD(l, b);
            System.out.println("Cost of Plastic is " + obj1.costSheet()+" with 40 ruppes per sq feet");
        }
        else {
            System.out.println("Height:");
            int h= sc.nextInt();
            ThreeD obj2 = new ThreeD(l,b,h);
            System.out.println("Cost of Plastic is "+ obj2.costBox()+" with 60 ruppess per cubic feet");

        }
    }
}

