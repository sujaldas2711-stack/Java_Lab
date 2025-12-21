package Day2;
import java.util.Scanner;
class Details{
    String name;
    int roll;
    float cgpa;
    void entry() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
        cgpa = sc.nextFloat();
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ roll);
        System.out.println("CGPA: "+ cgpa);
    }
}
public class Day2_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day_2.number of students: ");
        int n = sc.nextInt();
        Details[] stu = new Details[n];
        for (int i = 0; i< n; i++) {
            System.out.println("Enter details of student- "+ (i+1));
            stu[i] = new Details();
            stu[i].entry();
        }
        System.out.println("*******STUDENT DETAILS********");
        for (int i = 0; i< n; i++){
            stu[i].display();
        }
        int mincg = 0;
        for (int i = 1; i< n; i++){
            if (stu[i].cgpa < stu[mincg].cgpa){
                mincg = i;
            }
        }
        System.out.println("Name of the student with lowest cgpa: " + stu[mincg].name);
    }
}