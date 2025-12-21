package Day3;
import java.util.*;
class Account{
    double acc_no;
    double balance;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        acc_no = sc.nextDouble();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }
    void display(){
        System.out.println("Account number is: " + acc_no);
        System.out.println("Account Balance is: " + balance);
    }
}
class Person extends Account{
    double aadhar_no;
    String name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Aadhar number: ");
        aadhar_no = sc.nextDouble();
        System.out.println("Enter Name: ");
        sc.nextLine();
        name = sc.nextLine();
        super.input();
    }
    void display(){
        System.out.println("Aadhar number is: " + aadhar_no);
        System.out.println("Name is: " + name);
        super.display();
    }
}
public class Day3_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[3];
        for (int i = 0; i< 3; i++){
            System.out.println("Enter details of person " + (i + 1) + ":");
            p[i] = new Person();
            p[i].input();
        }
        System.out.println("--- Details of Three Persons ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            p[i].display();
        }
    }
}